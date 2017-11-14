package telas;

import modelo.CasoVO;
import gps.Maps;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import modelo.ConnectionException;
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
import com.src.android.R;
import util.FirebaseUtil;
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

public class CasoCadastrarActivity extends Activity{

	//Firebase
	private FirebaseDatabase database;
	private DatabaseReference reference;
	private String CASOS_CHILD = "casos";
	
	private static final String tag = "CasoCadAct";
	private Spinner doencaField;
	private EditText localizacaoField;
	private String message;
	private long idB;
	private CasoVO objCaso;
	//objeto criado com o intuito de obter os dados alterados
	private CasoVO objCasoInserir;

	private void initControls(){
		doencaField =  (Spinner) findViewById(R.id.Spinnerdoenca);
		localizacaoField = (EditText) findViewById(R.id.EditTextlocalizacao); 
	}

	public CasoCadastrarActivity() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.casocadastraractivity);
		initControls();
		
		objCasoInserir = new CasoVO();
		
		FirebaseUtil.getInstance().getInit(getApplicationContext());
		localizacaoField.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(CasoCadastrarActivity.this, Maps.class);
				startActivityForResult(i, 1);
			}
		});
		localizacaoField.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(CasoCadastrarActivity.this, Maps.class);
				startActivityForResult(i, 1);
			}
		});
		Vector<String> listaItensDoenca = new Vector<String>();
		listaItensDoenca.addElement("Dengue");
		listaItensDoenca.addElement("Zika");
		listaItensDoenca.addElement("Chikungunya");
		//criando arrayadpter adicionando o vetor criado
		ArrayAdapter arrayItensDoenca = new ArrayAdapter(this,
	    R.layout.spinneritem, listaItensDoenca);
	    //adicionando arrayadpater ao select(spinner)
		doencaField.setAdapter(arrayItensDoenca);
		//metodo para obter a selecao no select(spinner)
		doencaField.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
						objCasoInserir.doenca = arg0.getSelectedItem().toString();
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
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
			objCasoInserir.localizacao = localizacaoField.getText().toString();

			if(validation(objCasoInserir)){
			
			
				idB = FirebaseUtil.getInstance().insert(getApplicationContext(), CASOS_CHILD, objCasoInserir);	
				Log.i(tag, "The insert have a return equal ["+ idB +"]");
							
				if(idB < 1){
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
			ConnectionException.erro(CasoCadastrarActivity.this, "Erro ao inserir.\n Erro:\n " + e.toString());
		}	
	}

	protected boolean validation(CasoVO objCasoInserir) {
		String campos="";
 
		if(!(String.valueOf(objCasoInserir.doenca).equals("")
 || String.valueOf(objCasoInserir.localizacao).equals("")
		)){
			return true;
		}
		else{
			if(String.valueOf(objCasoInserir.localizacao).equals("")){
			campos = campos + "- localizacao\n";}
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
