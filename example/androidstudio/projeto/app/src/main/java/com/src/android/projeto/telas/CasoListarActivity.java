package com.src.android.projeto.telas;

import java.util.ArrayList;
import com.src.android.projeto.modelo.CasoVO;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import java.util.ArrayList;
import com.src.android.projeto.util.FirebaseUtil;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;
import android.widget.TextView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.src.android.projeto.R;

 /**@author Willamys Araujo
 **Generate for Jacroid**/

public class CasoListarActivity extends Activity{

	//Firebase
	private FirebaseDatabase database;
	
	private LinearLayoutManager manager;
	private ImageButton floatButton;
	private DatabaseReference reference;
	private String CASOS_CHILD = "casos";
	private static final String tag = "CasoListAct";
	private ArrayList<CasoVO> arrayCaso = new ArrayList<>();
	private ArrayList<String> keys = new ArrayList<>();
	private RecyclerView rvCaso;
	private FirebaseRecyclerAdapter<CasoVO, ViewHolder> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.casolistaractivity);
		rvCaso = (RecyclerView) findViewById(R.id.rvCaso);
		rvCaso.setHasFixedSize(true);
		manager = new LinearLayoutManager(this);
		manager.setReverseLayout(true);
		manager.setStackFromEnd(true);
		rvCaso.setLayoutManager(manager);
		
  
		reference = FirebaseUtil.getReference("casos").child(FirebaseAuth.getInstance().getCurrentUser().getUid());
		adapter = new FirebaseRecyclerAdapter<CasoVO, ViewHolder>(CasoVO.class, R.layout.viewholder, ViewHolder.class, reference) {
			@Override
			protected void populateViewHolder(final ViewHolder viewHolder, CasoVO model, int position) {
				final CasoVO casoVO = model;
				final DatabaseReference ref = getRef(position);
				final String key = ref.getKey();
				viewHolder.setKey(key);
				viewHolder.edit.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {

						PopupMenu popupMenu = new PopupMenu(getApplicationContext(), viewHolder.edit);
						popupMenu.inflate(R.menu.listmenu);
						popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
							@Override
							public boolean onMenuItemClick(MenuItem item) {
								switch (item.getItemId()) {
									case R.id.item_edit:
										Intent i = new Intent(CasoListarActivity.this, CasoAlterarActivity.class);
										Log.i(tag, "on click " + key);
										i.putExtra("valor", key);
										startActivityForResult(i, 1);
										break;
									case R.id.item_delete:
										delete(ref, casoVO);
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
			}
		};
		
		rvCaso.setAdapter(adapter);
		
		floatButton = (ImageButton) findViewById(R.id.add);
		floatButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(CasoListarActivity.this, CasoCadastrarActivity.class);
				startActivityForResult(i, 1);
			}
		});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.mainmenu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.item_info:
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}
	
	public boolean delete(final DatabaseReference reference, final CasoVO casoVO){
		new AlertDialog.Builder(this).setTitle(this.getResources()
				.getString(R.string.app_name)).setMessage(
						"Voce realmente deseja deletar?").setPositiveButton("SIM", 
								new android.content.DialogInterface.OnClickListener(){
							@Override
							public void onClick(DialogInterface arg0,
									int arg1) {
								String message = "";
								long ret = FirebaseUtil.getInstance().delete(getApplicationContext(),CASOS_CHILD, reference, casoVO);
								if( ret != -1 && ret != 0){
									message = "Delete efetuado com sucesso.";
								}else{
									message = "Nao foi possivel efetuar o delete.";
								}
								Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
							}
						}).setNegativeButton("No", new android.content.DialogInterface.OnClickListener(){
							@Override
							public void onClick(DialogInterface dialog,
									int which) {
							}
						}).show();
		return false;
	}
	
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		Toast.makeText(this,data.getExtras().getString("valor"), Toast.LENGTH_LONG).show();
	}

	@Override
	public void onBackPressed() 
	{
		Intent data = new Intent();
		data.putExtra("valor", "");
		setResult(2,data);
		finish();
	}
}
