package com.example.fslrecognitionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;

public class FslWords extends AppCompatActivity  implements RecyclerViewInterface{
    private AppCompatButton btnBackWords;
    RecyclerView recyclerView;
    ArrayList<FSLWordsModel> fslWordsModelArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_fsl_words);

        btnBackWords = findViewById(R.id.btnBackWords);
        recyclerView = findViewById(R.id.wordsRecyclerView);

        setUpFslWordsModelArrayList();

        FSLWords_RecyclerViewAdapter adapter = new FSLWords_RecyclerViewAdapter(this,
                fslWordsModelArrayList, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        btnBackWords.setOnClickListener((v)->{
            Intent intent = new Intent(FslWords.this, VocabBank.class);
            startActivity(intent);
        });

    }
    private void setUpFslWordsModelArrayList(){
        String[] fslWords = getResources().getStringArray(R.array.fsl_words);

        for(int i=0; i<fslWords.length; i++){
            fslWordsModelArrayList.add(new FSLWordsModel(fslWords[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(FslWords.this, FslWordsDetails.class);
        startActivity(intent);
    }
}