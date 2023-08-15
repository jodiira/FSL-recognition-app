package com.example.fslrecognitionapp;

public class FslNumberModel {
    private String fslNumber;
    private int imageResource;

    public FslNumberModel(String fslNumber, int imageResource){
        this.fslNumber = fslNumber;
        this.imageResource = imageResource;
    }

    public String getFslNumber(){
        return fslNumber;
    }

    public int getImageResource(){
        return imageResource;
    }
}
