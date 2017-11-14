package telas;

import modelo.CasoVO;
import gps.Maps;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
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

public class CasoAlterarActivity extends Activity{

	private static final String tag = "CasoAltAct";
	private FirebaseDatabase database;
 	private DatabaseReference reference;
	private Vector<String> listaItensEnumDoenca; 
 	private String CASOS_CHILD =  "casos";

	private Spinner doencaField;
	private EditText localizacaoField;
	private String message;
	private long idB;
	private long idB1 = 1; 
	private String valor;
	private CasoVO objCaso;
	//objeto criado com o intuito de obter os dados alterados
	private CasoVO objCasoInserir = new CasoVO();

	private void initControls() {
		doencaField =  (Spinner) findViewById(R.id.Spinnerdoenca);
		localizacaoField = (EditText) findViewById(R.id.EditTextlocalizacao); 
}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.casoalteraractivity);
		initControls();
		//pegar valor passado como parametro
		Intent intr = getIntent();
		valor = intr.getStringExtra("valor");
		Log.i(tag, " Valor passado " + "[ " + valor + " ]");
		 localizacaoField.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(CasoAlterarActivity.this, Maps.class);
				startActivityForResult(i, 1);
			}
		});
		 localizacaoField.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(CasoAlterarActivity.this, Maps.class);
				startActivityForResult(i, 1);
			}
		});
		
		objCaso = new CasoVO();
		//vetor com as opcoes do select(spinner)
		listaItensEnumDoenca = new Vector<String>();
		listaItensEnumDoenca.addElement("Dengue");
		listaItensEnumDoenca.addElement("Zika");
		listaItensEnumDoenca.addElement("Chikungunya");
		//criando arrayadpter adicionando o vetor criado
		ArrayAdapter arrayItensDoenca = new ArrayAdapter(this,
	    R.layout.spinneritem, listaItensEnumDoenca);
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
		FirebaseUtil.getInstance().getInit(getApplicationContext());
 
		reference = FirebaseUtil.getInstance().getFirebaseDatabase().getReference().child(CASOS_CHILD).child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child(valor);
		reference.addValueEventListener(new ValueEventListener() {
			@Override
			public void onDataChange(DataSnapshot dataSnapshot) {
				objCaso = dataSnapshot.getValue(CasoVO.class);
			// INICIO adicionando os valores dos campos quando for feita a alteracao
				if(objCaso != null){
			// selecionar o que foi selecionado no cadastro	
				for (int i = 0; i < listaItensEnumDoenca.size(); i++) {
					if(listaItensEnumDoenca.get(i).equals(objCaso.doenca)){
						doencaField.setSelection(i);
					}
				}
					localizacaoField.setText(String.valueOf(objCaso.localizacao));
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

	private void update(){
	try {
		Intent data = new Intent();
		Log.i(tag,"onClick invoked.");
		/*******INSERCAO NO BD********/
			objCasoInserir.localizacao = localizacaoField.getText().toString();

	if(validation(objCasoInserir)){
			
			idB = FirebaseUtil.getInstance().update(getApplicationContext(),CASOS_CHILD, reference, objCasoInserir.toMap());
			
			Log.i(tag, "The update have a return equal ["+ idB +"]");

			if(idB < 1){
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
