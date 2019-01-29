package com.method;

public class GameOver2Method {
    public static void main(String[] args) {
        int highScore = calculateHighScore(true, 600, 6, 240);
        System.out.println("Your Final Score Was: " + highScore);
        int highScorePosition = calculateHighScorePosition(highScore);
        displayHighScorePosition("Shakib", highScorePosition);
        //
        highScore = calculateHighScore(true, 400, 4, 160);
        System.out.println("Your Final Score Was: " + highScore);
        highScorePosition = calculateHighScorePosition(highScore);
        displayHighScorePosition("Saikat", highScorePosition);
        highScore = calculateHighScore(true, 300, 3, 120);
        System.out.println("Your Final Score Was: " + highScore);
        highScorePosition = calculateHighScorePosition(highScore);
        displayHighScorePosition("Mehidi", highScorePosition);
        //
        highScore = calculateHighScore(true, 100, 1, 40);
        System.out.println("Your Final Score Was: " + highScore);
        highScorePosition = calculateHighScorePosition(highScore);
        displayHighScorePosition("Rasel", highScorePosition);
    }

    private static int calculateHighScorePosition(int score) {
       /*
       if (score >= 1000) {
            return 1;
        } else if (score >= 800 && score <= 1000) {
            return 2;
        } else if (score >= 600 && score <= 800) {
            return 3;
        } else if (score >= 400 && score <= 600) {
            return 4;
        }
        return 0;
        */
        int playerPosition = 0;
        if (score >= 1000) {
            playerPosition = 1;
        } else if (score >= 800 && score <= 1000) {
            playerPosition = 2;
        } else if (score >= 600 && score <= 800) {
            playerPosition = 3;
        } else if (score >= 400 && score <= 600) {
            playerPosition = 4;
        }
        return playerPosition;
    }

    private static void displayHighScorePosition(String playerName, int playerScore) {
        System.out.println("Player Name: " + playerName + " -- " + " High Score: " + playerScore);
    }

    private static int calculateHighScore(boolean isGameOver, int score, int levelCompleted, int levelCompletedBonus) {
        if (isGameOver) {
            int finalScore = score + (levelCompleted + levelCompletedBonus);
            finalScore += 250;
            return finalScore;
        }
        return -1;
    }

}
