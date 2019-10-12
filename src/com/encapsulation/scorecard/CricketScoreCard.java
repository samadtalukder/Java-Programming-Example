package com.encapsulation.scorecard;

public class CricketScoreCard {
    private int score = 0;
    private int wicket = 0;

    public int getScore() {
        return score;
    }
    public int getWicket(){
        return wicket;
    }
    public void addRun(int score) {
        this.score = score;
    }
    public void addSix(){
        addRun(6 + score);
    }
    public void addFour(){
        addRun(4 + score);
    }
    public void addTwo(){
        addRun(2 + score);
    }
    public void addThree(){
        addRun(3 + score);
    }
    public void addOne(){
        addRun(1 + score);
    }
    public void addWide(){
        addRun(1 + score);
    }
    public void addWicket(int wicket){
        this.wicket = wicket;
    }

}
