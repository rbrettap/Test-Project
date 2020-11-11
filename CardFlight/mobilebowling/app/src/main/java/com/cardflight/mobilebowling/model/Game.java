package com.cardflight.mobilebowling.model;

public class Game {

    //Declaring Class Variables
    private Frame[] frames=new Frame[10];

    private int totalScore = 0;

    //Getters and Setters
    public Frame[] getFrames() {
        return frames;
    }
    public void setFrames(Frame[] frames) {
        this.frames = frames;
    }
    public int getTotalScore() {
        return this.totalScore;
    }

}

