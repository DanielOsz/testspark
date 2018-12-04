package com.example.danieloszczapinski.sparkapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pictures extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures);
    }
    public void main2(View view)
    {
        Intent intent = new Intent(Pictures.this, Main.class);
        startActivity(intent);
    }
    public void matches(View view)
    {
        Intent intent = new Intent(Pictures.this, Matches.class);
        startActivity(intent);
    }
    public void messages(View view)
    {
        Intent intent = new Intent(Pictures.this, Messages.class);
        startActivity(intent);
    }
    public void profile(View view)
    {
        Intent intent = new Intent(Pictures.this, Profile.class);
        startActivity(intent);
    }
    public void settings(View view)
    {
        Intent intent = new Intent(Pictures.this, Settings.class);
        startActivity(intent);
    }
}
