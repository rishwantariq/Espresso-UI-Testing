package com.example.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class homePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        TextView tv;
        tv = (TextView) findViewById(R.id.homePage);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String uname = extras.getString("UserName");
            //The key argument here must match that used in the other activity
            tv.setText("Welcome to your HomePage " + uname);
        }

    }
}
