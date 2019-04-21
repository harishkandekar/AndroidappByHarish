package com.example.harishapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup_form extends AppCompatActivity {

//    EditText txtEmail, txtPassword;
//    Button btn_Register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form);
        getSupportActionBar().hide();
//        txtEmail=(EditText)findViewById(R.id.txtName);
//        txtPassword=(EditText)findViewById(R.id.txtPwd);
//        btn_Register=(Button) findViewById(R.id.btnLogin);

    }

    public void gotoLogin(View view) {
        startActivity(new Intent(getApplicationContext(),Login_Form.class));
    }
}
