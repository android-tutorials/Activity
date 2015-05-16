package com.siokas.testapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;


public class Activity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        // To receive the the message from the previous activity you need to create a Bundle object
        Bundle bundle = getIntent().getExtras();

        String message = bundle.getString("MSG_ACT1");

        // Check if the extras are empty and toast them out
        if(!message.isEmpty())
            Toast.makeText(Activity2.this, message, Toast.LENGTH_LONG).show();

    }


}
