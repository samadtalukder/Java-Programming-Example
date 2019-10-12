package com.method.overloading;

public class GameOverOverloading {
    public static void main(String[] args) {
        calculateScore();
        calculateScore("Arjit");
        calculateScore("Arjit", 3000);
        calculateScore(5, 500);
        calculateScore("Arjit", 3000, "You Win");
    }

    private static void calculateScore() {
        System.out.println("No Player Name, No Score");
    }

    private static String calculateScore(String playerName) {
        System.out.println("Player Name: " + playerName);
        return playerName;
    }

    private static int calculateScore(String playerName, int playerScore) {
        System.out.println("Player Name: " + playerName + " -" + " Score: " + playerScore);
        return playerScore;
    }

    private static int calculateScore(int levelCompleted, int levelCompletedBonus) {
        System.out.println("Level Completed Bonus: " + levelCompleted + " -" + " Level Completed Bonus: " + levelCompletedBonus);
        return levelCompleted;
    }


    private static int calculateScore(String playerName, int playerScore, String result) {
        System.out.println("Player Name: " + playerName + " -" + " Score: " + playerScore + " - " + " Result: " + result);
        return playerScore;
    }
}
