package com.src.android.projeto.telas;

import com.src.android.projeto.modelo.AedesPointsVO;
import com.src.android.projeto.gps.Maps;
import com.src.android.projeto.camera.CameraActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
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
import com.google.firebase.auth.FirebaseUser;
import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseListAdapter;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.StorageReference;
 /**@author Willamys Araujo
 **Generate for Jacroid**/

public class AedesPointsAlterarActivity extends Activity{

	private static final String tag = "AedesPointsAltAct";
	private FirebaseDatabase database;
 	private DatabaseReference reference;
	private Vector<String> listaItensEnumTipo; 
 	private String AEDESPOINTSS_CHILD =  "aedespointss";

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
	private long idB1 = 1; 
	private String valor;
	private AedesPointsVO objAedesPoints;
	//objeto criado com o intuito de obter os dados alterados
	private AedesPointsVO objAedesPointsInserir = new AedesPointsVO();

	private void initControls() {
		tipoField =  (Spinner) findViewById(R.id.Spinnertipo);
		descricaoField = (EditText) findViewById(R.id.EditTextdescricao); 
		localizacaoField = (EditText) findViewById(R.id.EditTextlocalizacao); 
		fotoField =  (ImageView) findViewById(R.id.ImageViewfoto);
		fotoAuxField = (EditText) findViewById(R.id.EditTextfoto);
		turnoField =  (RadioGroup) findViewById(R.id.RadioGroupturno);
		validadoField =  (CheckBox) findViewById(R.id.CheckBoxvalidado);
}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aedespointsalteraractivity);
		initControls();
		//pegar valor passado como parametro
		Intent intr = getIntent();
		valor = intr.getStringExtra("valor");
		Log.i(tag, " Valor passado " + "[ " + valor + " ]");
		database = FirebaseUtil.getDatabase();
		 localizacaoField.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(AedesPointsAlterarActivity.this, Maps.class);
				startActivityForResult(i, 1);
			}
		});
		 localizacaoField.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(AedesPointsAlterarActivity.this, Maps.class);
				startActivityForResult(i, 1);
			}
		});
		
		objAedesPoints = new AedesPointsVO();
		//vetor com as opcoes do select(spinner)
		listaItensEnumTipo = new Vector<String>();
		listaItensEnumTipo.addElement("Agua parada");
		listaItensEnumTipo.addElement("Lixo");
		listaItensEnumTipo.addElement("Esgoto");
		//criando arrayadpter adicionando o vetor criado
		ArrayAdapter arrayItensTipo = new ArrayAdapter(this,
	    R.layout.spinneritem, listaItensEnumTipo);
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
							Intent i = new Intent(AedesPointsAlterarActivity.this, CameraActivity.class);
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
 
		reference = database.getReference().child(AEDESPOINTSS_CHILD).child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child(valor);
		reference.addValueEventListener(new ValueEventListener() {
			@Override
			public void onDataChange(DataSnapshot dataSnapshot) {
				objAedesPoints = dataSnapshot.getValue(AedesPointsVO.class);
			// INICIO adicionando os valores dos campos quando for feita a alteracao
				if(objAedesPoints != null){
			// selecionar o que foi selecionado no cadastro	
				for (int i = 0; i < listaItensEnumTipo.size(); i++) {
					if(listaItensEnumTipo.get(i).equals(objAedesPoints.tipo)){
						tipoField.setSelection(i);
					}
				}
					descricaoField.setText(String.valueOf(objAedesPoints.descricao));
					localizacaoField.setText(String.valueOf(objAedesPoints.localizacao));
					fotoAuxField.setText(String.valueOf(objAedesPoints.foto));
				for (int i = 0; i < turnoField.getChildCount(); i++){
					RadioButton btn = (RadioButton) turnoField.getChildAt(i);
					//verificando se o radio button selecionado está marcado ou não
					if(btn.getText().equals(objAedesPoints.turno) ){
						// pegando o nome do radio marcado
						btn.setChecked(true);
					}
				}					validadoField.setChecked(objAedesPoints.validado);
					
					StorageReference mStorageRef = FirebaseUtil.getInstance().getStorageReference().child("images/"+ String.valueOf(objAedesPoints.foto));
					FirebaseAuth mAuth = FirebaseUtil.getInstance().getFirebaseAuth();
					FirebaseUser user = mAuth.getCurrentUser();
					// Load the image using Glide
					Glide.with(getApplicationContext())
					        .using(new FirebaseImageLoader())
					        .load(mStorageRef)
					        .into(fotoField);
				}else{
					onBackPressed();
				}
			}
			@Override
			public void onCancelled(DatabaseError databaseError) {}
		});

		Button botao = (Button) findViewById(R.id.ButtonSendFeedback);
		botao.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				update();
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

	private void update(){
	try {
		Intent data = new Intent();
		Log.i(tag,"onClick invoked.");
		/*******INSERCAO NO BD********/
			objAedesPointsInserir.descricao = descricaoField.getText().toString();
			objAedesPointsInserir.localizacao = localizacaoField.getText().toString();
			objAedesPointsInserir.foto = fotoAuxField.getText().toString();
			objAedesPointsInserir.validado = validadoField.isChecked();

	if(validation(objAedesPointsInserir)){
			if(imgData != null){
				StorageReference mStorageRef = FirebaseUtil.getInstance().getStorageReference();
				FirebaseAuth mAuth = FirebaseUtil.getInstance().getFirebaseAuth();
				idB1 = FirebaseUtil.getInstance().upload(getApplicationContext(), getAppName(), fotoAuxField.getText().toString(), imgData, mStorageRef, mAuth);
				Log.i(tag, "The update have a return equal ["+ idB1 +"]");
			}
			
			idB = FirebaseUtil.getInstance().update(getApplicationContext(),AEDESPOINTSS_CHILD, reference, objAedesPointsInserir.toMap());
			
			Log.i(tag, "The update have a return equal ["+ idB +"]");

			if(idB1 < 1 &&	idB < 1){
				message = "Nao foi possivel efetuar a alteracao.";
			}else{
				message = "Alteracao efetuada com sucesso.";
			}
			data.putExtra("valor", message);
			setResult(2,data);
			finish();
		}else{
			message = "Complete todos os campos. Tente novamente.";
		}
		} catch (Exception e) {
				ConnectionException.erro(this, e.toString());
			}		
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if((data != null) && ( data.hasExtra("gps") && !data.getExtras().getString("gps").equals(""))){
				String gps = data.getExtras().getString("gps");
				localizacaoField.setText(gps);
		}
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
	public void onBackPressed() 
	{
		Intent data = new Intent();
		data.putExtra("valor", "voltar");
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
