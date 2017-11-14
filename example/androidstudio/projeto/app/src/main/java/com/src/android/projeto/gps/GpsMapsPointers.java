package com.src.android.projeto.gps;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.src.android.projeto.R;

import java.util.ArrayList;
import java.util.List;
import com.src.android.projeto.modelo.AedesPointsVO;
import com.src.android.projeto.modelo.CasoVO;
import com.src.android.projeto.util.FirebaseUtil;

 /**@author Willamys Araujo
 **Generate for Jacroid**/

public class GpsMapsPointers extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    DatabaseReference reference;
    /***CRIANDO A LISTA DE PONTOS **/
	ArrayList<AedesPointsVO> aedespointsList;
	ArrayList<CasoVO> casoList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
     	mMap = googleMap;
		aedespointsList = new ArrayList<AedesPointsVO>();
        reference = FirebaseUtil.getInstance().getReference("aedespointss");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot msgSnapshot: dataSnapshot.getChildren()) {
                	for(DataSnapshot msgSnapshot2: msgSnapshot.getChildren()){
                	aedespointsList.add(msgSnapshot2.getValue(AedesPointsVO.class));
	                    String local = msgSnapshot2.getValue(AedesPointsVO.class).getLocalizacao();
	                    String latit =  local.substring(0,local.indexOf(","));
	                    String longi = local.substring(local.indexOf(",")+1, local.length()-1);
	                   	LatLng locate = new LatLng(Double.parseDouble(latit),Double.parseDouble(longi));
	                   	mMap.addMarker(new MarkerOptions().position(locate).snippet(msgSnapshot2.getKey()).title("aedespoints"));
	                   	mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(locate,18));
                	}
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
      
		casoList = new ArrayList<CasoVO>();
        reference = FirebaseUtil.getInstance().getReference("casos");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot msgSnapshot: dataSnapshot.getChildren()) {
                	for(DataSnapshot msgSnapshot2: msgSnapshot.getChildren()){
                	casoList.add(msgSnapshot2.getValue(CasoVO.class));
	                    String local = msgSnapshot2.getValue(CasoVO.class).getLocalizacao();
	                    String latit =  local.substring(0,local.indexOf(","));
	                    String longi = local.substring(local.indexOf(",")+1, local.length()-1);
	                   	LatLng locate = new LatLng(Double.parseDouble(latit),Double.parseDouble(longi));
	                   	mMap.addMarker(new MarkerOptions().position(locate).snippet(msgSnapshot2.getKey()).title("caso"));
	                   	mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(locate,18));
                	}
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
      
    }
}