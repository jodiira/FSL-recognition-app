package com.example.fslrecognitionapp;

public class FslPhrasesModel {
    private String fslPhrases;
    private int videoResource;

    public FslPhrasesModel(String fslPhrase, int videoResource) {
        this.fslPhrases = fslPhrase;
        this.videoResource = videoResource;
    }

    public String getFslPhrase() {
        return fslPhrases;
    }

    public int getVideoResource() {
        return videoResource;
    }

}
