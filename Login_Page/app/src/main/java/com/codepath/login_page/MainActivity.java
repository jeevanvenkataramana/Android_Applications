package com.codepath.sms_sending_app;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.app.Activity;

import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;

import android.util.Log;
import android.view.Menu;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button loginBtn;
    Button regBtn;
    Button signUp;
    Button login;
    EditText userName;
    EditText userEmail;
    EditText userPassword;
    String name;
    String email;
    String password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = (Button) findViewById(R.id.btnLogin);
        regBtn = (Button) findViewById(R.id.btnReg);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                loginUser();
            }
        });

        regBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                registerUser();
            }
        });
    }
    protected void registerUser() {
        setContentView(R.layout.reg_userpage);

        signUp = (Button) findViewById(R.id.btnSignUser);
        userName = (EditText) findViewById(R.id.editText);
        userEmail = (EditText) findViewById(R.id.editText2);
        userPassword = (EditText) findViewById(R.id.editText3);

        signUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                return;
            }
        });

    }
    protected void loginUser() {
        setContentView(R.layout.log_userpage);


        login = (Button) findViewById(R.id.btnLoginUser);
        userEmail = (EditText) findViewById(R.id.editText);
        userPassword = (EditText) findViewById(R.id.editText2);

        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                return;
            }
        });






    }
}
