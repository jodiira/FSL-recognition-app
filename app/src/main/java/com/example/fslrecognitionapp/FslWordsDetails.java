package com.example.fslrecognitionapp;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class FslWordsDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_fsl_words_details);

        // Get the selected word and video resource ID from the Intent extras
        String selectedWord = getIntent().getStringExtra("selected_word");
        int selectedVideoResource = getIntent().getIntExtra("selected_video_resource", 0); // 0 is the default value

        // Construct the video resource path using the resource ID
        String videoPath = "android.resource://" + getPackageName() + "/" + selectedVideoResource;

        // Set the word to the TextView
        TextView wordTextView = findViewById(R.id.wordTextView);
        wordTextView.setText(selectedWord);


        // Set the video to the VideoView
        VideoView wordVideoView = findViewById(R.id.wordVideoView);
        wordVideoView.setVideoURI(Uri.parse(videoPath));
        wordVideoView.start();

// Play/pause toggle
        wordVideoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wordVideoView.isPlaying()) {
                    wordVideoView.pause();
                } else {
                    wordVideoView.start();
                }
            }
        });
    }
}

