package com.example.danieloszczapinski.sparkapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Messages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
    }
    public void main2(View view)
    {
        Intent intent = new Intent(Messages.this, Main.class);
        startActivity(intent);
    }
    public void matches(View view)
    {
        Intent intent = new Intent(Messages.this, Matches.class);
        startActivity(intent);
    }
    public void messages(View view)
    {
        Intent intent = new Intent(Messages.this, Messages.class);
        startActivity(intent);
    }
    public void profile(View view)
    {
        Intent intent = new Intent(Messages.this, Profile.class);
        startActivity(intent);
    }
    public void settings(View view)
    {
        Intent intent = new Intent(Messages.this, Settings.class);
        startActivity(intent);
    }
}
