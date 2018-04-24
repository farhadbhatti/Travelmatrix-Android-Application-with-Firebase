package com.travelmatrix.bhatti.travelmatrix;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FirebaseUtils {
    public static FirebaseDatabase mFirebaseDatabase;
    public static DatabaseReference mDatabaseReference;
    private static FirebaseUtils firebaseUtils;
    public static ArrayList<TravelDeal> mDeals;


    private FirebaseUtils() {}

    public static void OpenFbReference(String ref){
        if(firebaseUtils == null){
            firebaseUtils = new FirebaseUtils();
            mFirebaseDatabase = FirebaseDatabase.getInstance();
            mDeals = new ArrayList<TravelDeal>();
        }
        mDatabaseReference = mFirebaseDatabase.getReference().child(ref);
    }

}
