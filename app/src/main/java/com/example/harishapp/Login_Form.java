package com.example.harishapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login_Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__form);
        getSupportActionBar().hide();
    }

//

    public void gotoSignup(View view) {
        startActivity(new Intent(getApplicationContext(),Signup_form.class));
    }
}
