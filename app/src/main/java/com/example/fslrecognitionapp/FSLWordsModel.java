package com.example.fslrecognitionapp;

public class FSLWordsModel {
    private String fslWord;
    private int videoResource;  // Change the data type to int for video resource ID

    public FSLWordsModel(String fslWord, int videoResource) {
        this.fslWord = fslWord;
        this.videoResource = videoResource;
    }

    public String getFslWord() {
        return fslWord;
    }

    public int getVideoResource() {
        return videoResource;
    }
}
