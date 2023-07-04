package com.example.fslrecognitionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class VocabBank extends AppCompatActivity {
    private AppCompatButton btnBackVB;
    private Button btnWords, btnPhrases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vocab_bank);

        btnBackVB = findViewById(R.id.btnBackVB);
        btnWords = findViewById(R.id.btnWords);
        btnPhrases = findViewById(R.id.btnPhrases);


        btnBackVB.setOnClickListener((v)->{
            Intent intent = new Intent(VocabBank.this, MainScreen.class);
            startActivity(intent);

        });

        btnWords.setOnClickListener((v)->{
            Intent intent = new Intent(VocabBank.this, FslWords.class);
            startActivity(intent);
        });

    }
}