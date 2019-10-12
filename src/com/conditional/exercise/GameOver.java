package com.conditional.exercise;

public class GameOver {
    public static void main(String[] args) {
        boolean isGameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int levelCompletedBonus = 150;
        if (isGameOver) {
            int finalScore = score + (levelCompleted + levelCompletedBonus);
            System.out.println("Your Final Score: " + finalScore);
        }
        score = 800;
        levelCompleted = 6;
        levelCompletedBonus = 180;
        if (isGameOver) {
            int finalScore = score + (levelCompleted + levelCompletedBonus);
            finalScore += 100;
            System.out.println("Your Final Score: " + finalScore);
        }
    }
}
