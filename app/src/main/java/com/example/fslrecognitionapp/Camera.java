package com.example.fslrecognitionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class Camera extends AppCompatActivity {

    private ImageButton btnBackCamera, btnHelp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_camera);


        btnBackCamera = findViewById(R.id.btnBackCamera);
        btnHelp = findViewById(R.id.btnHelp);


        btnBackCamera.setOnClickListener((v)->{
            Intent intent = new Intent(Camera.this, MainScreen.class);
            startActivity(intent);
        });

        btnHelp.setOnClickListener((v)->{
            Intent intent = new Intent(Camera.this, Help.class);
            startActivity(intent);
        });



    }
}
