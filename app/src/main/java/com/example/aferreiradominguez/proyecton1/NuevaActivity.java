package com.example.aferreiradominguez.proyecton1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by aferreiradominguez on 13/01/17.
 */
public class NuevaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nuevaactivity);
        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        // Create the text view
        TextView textView = (TextView) findViewById(R.id.tW_del_display);
        textView.setText(message);

        // Set the text view as the activity layout
        //setContentView(textView);


    }

    public void goBack(View b) {
        Intent intent = new Intent();
        setResult(Activity.RESULT_OK, intent);
        finish();

    }
}