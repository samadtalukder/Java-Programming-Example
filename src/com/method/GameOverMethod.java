package com.method;

public class GameOverMethod {
    public static void main(String[] args) {
        // Show Game Total Score
        showTotalScore(true, 600, 6, 200);
    }

    private static void showTotalScore(boolean isGameOver, int score, int levelCompleted, int levelCompletedBonus) {
        if (isGameOver) {
            int finalScore = score + (levelCompleted + levelCompletedBonus);
            finalScore += 100;
            System.out.println("Your Final Score: " + finalScore);
        } else {
            System.out.println("Your Game Is Not Over: ");
        }
    }
}
