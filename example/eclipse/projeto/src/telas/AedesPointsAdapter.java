package telas;

import java.util.ArrayList;
import com.src.android.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import modelo.AedesPointsVO;

 /**@author Willamys Araujo
 **Generate for Jacroid**/

public class AedesPointsAdapter extends ArrayAdapter<String> {
	
	private final ArrayList<AedesPointsVO> aedespointss;
	private final ArrayList<String> keysAedesPointss;
	private final Context context;
	
	public AedesPointsAdapter(ArrayList<String> keysAedesPointss, ArrayList<AedesPointsVO> aedespointss, Context context) {
		super(context, R.layout.adapter, R.id.TextViewKey,keysAedesPointss);
		this.keysAedesPointss = keysAedesPointss;
		this.aedespointss = aedespointss;
		this.context = context;
	}
	
	@Override
	public int getCount() {
		return keysAedesPointss.size();
	}

	@Override
	public String getItem(int position) {
		return keysAedesPointss.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = LayoutInflater.from(this.context).inflate(R.layout.adapter, parent, false);
		String key = keysAedesPointss.get(position);
		TextView nome = (TextView) view.findViewById(R.id.TextViewKey);
		nome.setText(String.valueOf(key));
		return view;
	}
	
	@Override
	public View getDropDownView(int position, View convertView, ViewGroup parent) {
		//AedesPointsVO aedespoints = aedespointss.get(position);
		String key = keysAedesPointss.get(position);
		TextView label = new TextView(context);
		label.setTextSize(20f);
		label.setPadding(10,10,10,10);
		label.setText(key);
		//label.setText(String.valueOf(aedespoints.getKeyAedesPoints()));
		return label;
	}
}
