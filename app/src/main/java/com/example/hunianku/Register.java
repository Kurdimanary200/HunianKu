package com.example.hunianku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void kelogin(View v){
        Intent pindah = new Intent(Register.this,Login.class);
        startActivity(pindah);
        Register.this.finish();
    }
}