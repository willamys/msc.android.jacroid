package com.src.android.projeto.telas;

import com.src.android.projeto.modelo.AedesPointsVO;
import com.src.android.projeto.gps.Maps;
import com.src.android.projeto.camera.CameraActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.src.android.projeto.modelo.ConnectionException;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.Vector;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import com.src.android.projeto.R;
import com.src.android.projeto.util.FirebaseUtil;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.auth.FirebaseAuth;
import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.StorageReference;

 /**@author Willamys Araujo
 **Generate for Jacroid**/

public class AedesPointsCadastrarActivity extends Activity{

	//Firebase
	private FirebaseDatabase database;
	private DatabaseReference reference;
	private String AEDESPOINTSS_CHILD = "aedespointss";
	
	private static final String tag = "AedesPointsCadAct";
	private Spinner tipoField;
	private EditText descricaoField;
	private EditText localizacaoField;
	private EditText fotoAuxField; 
	private byte[] imgData;
	private int PICK_IMAGE_REQUEST = 1;
	private ImageView fotoField;
	private RadioGroup turnoField;
	private CheckBox validadoField;
	private String message;
	private long idB;
	private AedesPointsVO objAedesPoints;
	//objeto criado com o intuito de obter os dados alterados
	private AedesPointsVO objAedesPointsInserir;

	private void initControls(){
		tipoField =  (Spinner) findViewById(R.id.Spinnertipo);
		descricaoField = (EditText) findViewById(R.id.EditTextdescricao); 
		localizacaoField = (EditText) findViewById(R.id.EditTextlocalizacao); 
		fotoField =  (ImageView) findViewById(R.id.ImageViewfoto);
		fotoAuxField = (EditText) findViewById(R.id.EditTextfoto);
		turnoField =  (RadioGroup) findViewById(R.id.RadioGroupturno);
		validadoField =  (CheckBox) findViewById(R.id.CheckBoxvalidado);
	}

	public AedesPointsCadastrarActivity() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aedespointscadastraractivity);
		initControls();
		
		objAedesPointsInserir = new AedesPointsVO();
		database = FirebaseUtil.getDatabase();
		localizacaoField.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(AedesPointsCadastrarActivity.this, Maps.class);
				startActivityForResult(i, 1);
			}
		});
		localizacaoField.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(AedesPointsCadastrarActivity.this, Maps.class);
				startActivityForResult(i, 1);
			}
		});
		Vector<String> listaItensTipo = new Vector<String>();
		listaItensTipo.addElement("Agua parada");
		listaItensTipo.addElement("Lixo");
		listaItensTipo.addElement("Esgoto");
		//criando arrayadpter adicionando o vetor criado
		ArrayAdapter arrayItensTipo = new ArrayAdapter(this,
	    R.layout.spinneritem, listaItensTipo);
	    //adicionando arrayadpater ao select(spinner)
		tipoField.setAdapter(arrayItensTipo);
		//metodo para obter a selecao no select(spinner)
		tipoField.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
						objAedesPointsInserir.tipo = arg0.getSelectedItem().toString();
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
			}
		});
		fotoAuxField.setVisibility(android.view.View.INVISIBLE);
		fotoField.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				PopupMenu popupMenu = new PopupMenu(getApplicationContext(), fotoField);
				popupMenu.inflate(R.menu.menuimage);
				popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

					@Override
					public boolean onMenuItemClick(MenuItem item) {
						switch (item.getItemId()) {
						case R.id.item_camera:
							Intent i = new Intent(AedesPointsCadastrarActivity.this, CameraActivity.class);
							startActivityForResult(i, 1);
							break;
						case R.id.item_gallery:
							Intent intent = new Intent();
							// Show only images, no videos or anything else
							intent.setType("image/*");
							intent.setAction(Intent.ACTION_GET_CONTENT);
							// Always show the chooser (if there are multiple options available)
							startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);
							break;
						default:
							break;
						}
						return false;
					}
				});
				popupMenu.show();
			}
		});
		RadioButton radioTurno;
		radioTurno = new RadioButton(this);
		radioTurno.setTextColor(Color.parseColor("#3e4a56"));
		radioTurno.setText("Manha");
		radioTurno.setChecked(false);
		turnoField.addView(radioTurno);
		radioTurno = new RadioButton(this);
		radioTurno.setTextColor(Color.parseColor("#3e4a56"));
		radioTurno.setText("Tarde");
		radioTurno.setChecked(false);
		turnoField.addView(radioTurno);
		radioTurno = new RadioButton(this);
		radioTurno.setTextColor(Color.parseColor("#3e4a56"));
		radioTurno.setText("Noite");
		radioTurno.setChecked(false);
		turnoField.addView(radioTurno);
		turnoField.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup arg0, int arg1) {
				for (int i = 0; i < arg0.getChildCount(); i++) {
					RadioButton btn = (RadioButton) arg0.getChildAt(i);
					if(btn.getId() == arg1){
						objAedesPointsInserir.turno = String.valueOf(btn.getText());
					}
				}
			}
		});

		Button botao = (Button) findViewById(R.id.ButtonSendFeedback);
		botao.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				insert();
			}
		});
	
		Button botaoVoltar = (Button) findViewById(R.id.ButtonBack);
		botaoVoltar.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				onBackPressed();
			}
		});
	}
	
	public void insert(){
		try {
			Intent data = new Intent();

			Log.i(tag,"onClick invoked.");

			/*******INSERCAO NO BD********/
			objAedesPointsInserir.descricao = descricaoField.getText().toString();
			objAedesPointsInserir.localizacao = localizacaoField.getText().toString();
			objAedesPointsInserir.foto = fotoAuxField.getText().toString();
				objAedesPointsInserir.validado = validadoField.isChecked();

			if(validation(objAedesPointsInserir)){
			
				StorageReference mStorageRef = FirebaseUtil.getInstance().getStorageReference();
				FirebaseAuth mAuth = FirebaseUtil.getInstance().getFirebaseAuth();
				long idB1 = FirebaseUtil.getInstance().upload(getApplicationContext(), getAppName(), fotoAuxField.getText().toString(), imgData, mStorageRef, mAuth);
				Log.i(tag, "The insert have a return equal ["+ idB1 +"]");
			
				idB = FirebaseUtil.getInstance().insert(getApplicationContext(), AEDESPOINTSS_CHILD, objAedesPointsInserir);	
				Log.i(tag, "The insert have a return equal ["+ idB +"]");
							
				if(idB1 < 1 &&	idB < 1){
					message = "Nao foi possivel efetuar o cadastro.";
				}else{
					message = "Cadastro efetuado com sucesso.";
				}
				data.putExtra("valor", message);
				setResult(2,data);
				finish();
			}else{
				message = "Complete todos os campos.Tente novamente.";
			}
		}catch (Exception e) {
			ConnectionException.erro(AedesPointsCadastrarActivity.this, "Erro ao inserir.\n Erro:\n " + e.toString());
		}	
	}

	protected boolean validation(AedesPointsVO objAedesPointsInserir) {
		String campos="";
 
		if(!(String.valueOf(objAedesPointsInserir.tipo).equals("")
 || String.valueOf(objAedesPointsInserir.descricao).equals("")
 || String.valueOf(objAedesPointsInserir.localizacao).equals("")
 || String.valueOf(objAedesPointsInserir.foto).equals("")
 || String.valueOf(objAedesPointsInserir.turno).equals("")
 || objAedesPointsInserir.validado == null 		)){
			return true;
		}
		else{
			if(String.valueOf(objAedesPointsInserir.descricao).equals("")){
			campos = campos + "- Descricao\n";}
			if(String.valueOf(objAedesPointsInserir.localizacao).equals("")){
			campos = campos + "- Localizacao\n";}
			if(String.valueOf(objAedesPointsInserir.foto).equals("")){
			campos = campos + "- Foto\n";}
			new AlertDialog.Builder(this).setTitle(this.getResources()
					.getString(R.string.app_name)).setMessage(
					"Os campos:\n" + campos + " esta(ao) vazios.\n" +
					"Complete todos os campos. Tente novamente.")
					.setPositiveButton("continue", 
							new android.content.DialogInterface.OnClickListener(){
						@Override
						public void onClick(DialogInterface arg0,
								int arg1) {
						}
					}).show();
			return false;
		}
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		/*** ATUALIZAR VALOR DO EditText QUE RECEBERA A LOCALIZACAO**/
		if((data != null) && ( data.hasExtra("gps") && !data.getExtras().getString("gps").equals(""))){
				String gps = data.getExtras().getString("gps");
				localizacaoField.setText(gps);
		}
		/*** ATUALIZAR VALOR DO EditText QUE RECEBERA A LOCALIZACAO**/
		if((data != null) && ( data.hasExtra("gps") && !data.getExtras().getString("gps").equals(""))){
				String gps = data.getExtras().getString("gps");
				localizacaoField.setText(gps);
		}
		if((data != null) && (data.hasExtra("camera") && !data.getExtras().getString("camera").equals(""))){
				String camera = data.getExtras().getString("camera");
				File file = new File(camera);
				Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
				imgData = baos.toByteArray();
				fotoField.setImageBitmap(bitmap);
				String nameImage = "IMG_"+ new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".jpg";
				fotoAuxField.setText(nameImage);
		}
		if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
			Uri uri = data.getData();
			try {
				Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
				imgData = baos.toByteArray();
				fotoField.setImageBitmap(bitmap);
				String nameImage = "IMG_"+ new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".jpg";
				fotoAuxField.setText(nameImage);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void onBackPressed(){
		Intent data = new Intent();
		data.putExtra("valor", "");
		setResult(2,data);
		finish();
	}
	public String getAppName(){
		PackageInfo pinfo =  null;
		String name = "";
		try {
			pinfo = getPackageManager().getPackageInfo(getPackageName(), 0);
			name = pinfo.applicationInfo.loadLabel(getPackageManager()).toString();
		} catch (NameNotFoundException e) {
			Log.d(tag, "Error: "+ e.getMessage());
		}
		return name;
	}
}
