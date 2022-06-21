package com.example.murottal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class kisah_sahabat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kisah_sahabat);

        ImageView backbtn =(ImageView)findViewById(R.id.imageView9);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(kisah_sahabat.this,MenuActivity.class);
                startActivity(j);
            }
        });


    }
}