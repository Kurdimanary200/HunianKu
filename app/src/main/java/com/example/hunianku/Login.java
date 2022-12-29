package com.example.hunianku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void kedaftar(View v){
        Intent pindah = new Intent(Login.this,Register.class);
        startActivity(pindah);
        Login.this.finish();
    }
}