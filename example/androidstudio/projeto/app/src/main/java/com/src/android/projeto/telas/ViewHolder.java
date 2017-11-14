package com.src.android.projeto.telas;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.src.android.projeto.R;

 /**@author Willamys Araujo
 **Generate for Jacroid**/

public class ViewHolder extends RecyclerView.ViewHolder {

    public TextView key;
    public ImageButton edit;

    public ViewHolder(View itemView) {
        super(itemView);
        key = (TextView) itemView.findViewById(R.id.key);
        edit = (ImageButton) itemView.findViewById(R.id.edit);
    }

    public void setKey(String key) {
        this.key.setText(key);
    }
}