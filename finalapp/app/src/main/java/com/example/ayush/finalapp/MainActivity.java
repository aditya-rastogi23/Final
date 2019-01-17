package com.example.ayush.finalapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final TextView textView = (TextView)findViewById(R.id.test);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),NegotiatorRegistration.class);
                v.getContext().startActivity(intent);
            }
        });

     /*   Button buttont = (Button)findViewById(R.id.buttont);
        buttont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentt = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intentt);

            }
        });*/

    }

}
