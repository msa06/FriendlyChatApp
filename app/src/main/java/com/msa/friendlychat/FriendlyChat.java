package com.msa.friendlychat;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class FriendlyChat extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
