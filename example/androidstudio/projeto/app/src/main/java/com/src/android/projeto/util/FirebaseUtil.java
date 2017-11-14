package com.src.android.projeto.util;

import android.content.Context;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.storage.UploadTask;
import java.util.Map;

 /**@author Willamys Araujo
 **Generate for Jacroid**/

public class FirebaseUtil<T> implements Crud<T> {
    private static FirebaseDatabase mDatabase = null;
    private static DatabaseReference mReference = null;
    private StorageReference storageReference = null;
	private FirebaseAuth firebaseauth = null; 
	private static String AEDESPOINTSS_CHILD =  "aedespointss";
	private static String CASOS_CHILD =  "casos";
    private static FirebaseUtil firebaseUtil = null;
	long result = 0;
    byte[] localFile = null;
    public FirebaseUtil() {}

    public static FirebaseUtil getInstance() {
        if(firebaseUtil == null){
            firebaseUtil = new FirebaseUtil();
        }
        return firebaseUtil;
    }
	
	public StorageReference getStorageReference() {
	  	storageReference = FirebaseStorage.getInstance().getReference();
		return storageReference;
	}
	
    public static FirebaseDatabase getDatabase() {
        if (mDatabase == null) {
           FirebaseDatabase.getInstance().setPersistenceEnabled(true);
           mDatabase = FirebaseDatabase.getInstance();
       }
       return mDatabase;
    }
    
    public FirebaseAuth getFirebaseAuth() {
		 if(firebaseauth == null) {
           firebaseauth = FirebaseAuth.getInstance();
       }
		return firebaseauth;
	}

    public static DatabaseReference getReference(String ref){
        switch (ref){
		case "aedespointss":
			return getDatabase().getReference(AEDESPOINTSS_CHILD);
		case "casos":
			return getDatabase().getReference(CASOS_CHILD);
        }
        return mReference;
    }
    @Override
    public long insert(Context context, String reference, T vo) {
        if(vo == null){
            return -1;
        }else{        
            getReference(reference).child(FirebaseAuth.getInstance().getCurrentUser().getUid()).push().setValue(vo);
            return 1;
        }
    } 
    @Override
    public long update(Context context, String reference, DatabaseReference dtReference, Map<String, Object> values) {
        if(values == null){
            return -1;
        }else{
            dtReference.updateChildren(values);
            return 1;
        }
    }

    @Override
    public long delete(Context context, String reference, DatabaseReference dtReference, T vo) {
        if(vo == null){
            return -1;
        }else{
            dtReference.removeValue();
            return 1;
        }
    }
    @Override
	public long upload(final Context context, String appName,String nameImage, byte[] imgData, 
			StorageReference storageReference, FirebaseAuth mAuth) {
  
		StorageReference imgRef = storageReference.child("images/"+nameImage);

		imgRef.putBytes(imgData)
		.addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
			@Override
			public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
				result = 1;
			}
		})
		.addOnFailureListener(new OnFailureListener() {
			@Override
			public void onFailure(Exception exception) {
				result = -1;
				//Log.e("ds", "FailureUpload", exception);
				//modelo.ConnectionException.erro(context, exception.toString());
			}
		});
		return result;
	}

	@Override
	public byte[] download(final Context context, String appName, String nameImage, byte[] imgData,
			StorageReference storageReference, FirebaseAuth mAuth) {
  
		storageReference.child("images/"+nameImage).getBytes(Long.MAX_VALUE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
			    @Override
			    public void onSuccess(byte[] bytes) {
			        localFile = bytes;
			    }
			}).addOnFailureListener(new OnFailureListener() {
			    @Override
			    public void onFailure(Exception exception) {
			       localFile = null;
			       //Log.e("ds", "FailureDownload", exception);
			       //modelo.ConnectionException.erro(context, exception.toString());
			    }
			});
		return localFile;
	}
}
