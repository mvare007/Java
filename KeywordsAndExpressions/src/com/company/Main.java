package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, 5000, 5, 100);
        System.out.println("Your final score was " + highScore);

//	    if (score == 5000) {
//            System.out.println("Your score was 5000");
//        } else if (score < 5000) {
//			System.out.println("Your score was less than 5000");
//		} else {
//			System.out.println("Game over");
//		}

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int playerOneScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Gervásio", playerOneScore);

        int playerTwoScore = calculateHighScorePosition(900);
        displayHighScorePosition("John", playerTwoScore);

        int playerThreeScore = calculateHighScorePosition(400);
        displayHighScorePosition("Denver", playerThreeScore);

        int playerFourScore = calculateHighScorePosition(50);
        displayHighScorePosition("Wilkins", playerFourScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int scorePosition) {
        System.out.println(playerName + " managed to get into position " + scorePosition);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
