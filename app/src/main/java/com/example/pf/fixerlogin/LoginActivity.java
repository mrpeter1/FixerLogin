package com.example.pf.fixerlogin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {
    @Override
    //variables to be used throughout login process

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState); //finds last saved instance state
        setContentView(R.layout.activity_login); //starts with activity_login layout view

        //login variables are registered here
        EditText editUsername = (EditText) findViewById(R.id.editEmailSignIN);
        EditText editPassword = (EditText) findViewById(R.id.editPassword);
        Button buttonSignIn = (Button) findViewById(R.id.btSignIn);
        Button registerButton = (Button) findViewById(R.id.btRegisterNew);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class); //create an intent that registers the activity
                LoginActivity.this.startActivity(registerIntent); //tell the activity that we're on to perform the intent, and will open register page


            }
        });

    }
}

