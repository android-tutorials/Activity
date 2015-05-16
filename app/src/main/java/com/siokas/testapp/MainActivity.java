package com.siokas.testapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    // Declare the widgets and variables
    Button bt;
    TextView tv;
    private static final String message = "THIS IS A MESSAGE FROM ACTIVITY 1!";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initiate the widgets with their ids
        bt = (Button) findViewById(R.id.bt);
        tv = (TextView) findViewById(R.id.tv);

        // Set an onClickListener to the button and start the 2nd activity inside the onClick() method
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create an intent object
                Intent intent = new Intent(MainActivity.this, Activity2.class);

                // Add extras to the intent in order to send a message to the next activity
                intent.putExtra("MSG_ACT1", message);

                // Just call the startActivity() method to show the next activity and pass the intent object as parameter
                startActivity(intent);
            }
        });

    }


}

