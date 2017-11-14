package com.src.android.projeto.telas;

import java.util.ArrayList;
import com.src.android.projeto.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.src.android.projeto.modelo.CasoVO;

 /**@author Willamys Araujo
 **Generate for Jacroid**/

public class CasoAdapter extends ArrayAdapter<String> {
	
	private final ArrayList<CasoVO> casos;
	private final ArrayList<String> keysCasos;
	private final Context context;
	
	public CasoAdapter(ArrayList<String> keysCasos, ArrayList<CasoVO> casos, Context context) {
		super(context, R.layout.adapter, R.id.TextViewKey,keysCasos);
		this.keysCasos = keysCasos;
		this.casos = casos;
		this.context = context;
	}
	
	@Override
	public int getCount() {
		return keysCasos.size();
	}

	@Override
	public String getItem(int position) {
		return keysCasos.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = LayoutInflater.from(this.context).inflate(R.layout.adapter, parent, false);
		String key = keysCasos.get(position);
		TextView nome = (TextView) view.findViewById(R.id.TextViewKey);
		nome.setText(String.valueOf(key));
		return view;
	}
	
	@Override
	public View getDropDownView(int position, View convertView, ViewGroup parent) {
		//CasoVO caso = casos.get(position);
		String key = keysCasos.get(position);
		TextView label = new TextView(context);
		label.setTextSize(20f);
		label.setPadding(10,10,10,10);
		label.setText(key);
		//label.setText(String.valueOf(caso.getKeyCaso()));
		return label;
	}
}
