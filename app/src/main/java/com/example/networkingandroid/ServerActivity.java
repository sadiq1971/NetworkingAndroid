package com.example.networkingandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class ServerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);

        final TextView mTextView = (TextView) findViewById(R.id.internet_text);
        mTextView.setText("This text has been modified by magic");
    }



}
