package com.example.danieloszczapinski.sparkapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void main2(View view)
    {
        Intent intent = new Intent(Login.this, Main.class);
        startActivity(intent);
    }
}
