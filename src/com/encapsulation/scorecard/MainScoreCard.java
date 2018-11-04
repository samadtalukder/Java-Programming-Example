package com.encapsulation.scorecard;

public class MainScoreCard {
    public static void main(String[] args){
        CricketScoreCard scoreCard = new CricketScoreCard();
        scoreCard.addRun(10);
        scoreCard.addFour();
        scoreCard.addSix();
        scoreCard.addOne();
        scoreCard.addTwo();
        scoreCard.addThree();
        scoreCard.addWide();
        scoreCard.addWicket(1);
        System.out.println("Run: "+scoreCard.getScore());
        System.out.println("Wicket: "+scoreCard.getWicket());
    }
}
