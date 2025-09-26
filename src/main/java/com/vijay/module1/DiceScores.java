package com.vijay.module1;
class DiceScores {
	
    public int score(String nomination, String d1, String d2, String d3) {
        int die1 = Integer.parseInt(d1);
        int die2 = Integer.parseInt(d2);
        int die3 = Integer.parseInt(d3);

        int score = 0;
        switch (nomination) {
            case "ones":   score = scoreFor(1, die1, die2, die3); break;
            case "twos":   score = scoreFor(2, die1, die2, die3); break;
            case "threes": score = scoreFor(3, die1, die2, die3); break;
            default: System.out.println("Invalid category!");
                     return Integer.MAX_VALUE;
        }
        return score;
    }

    private int scoreFor(int number, int... dice) {
        int sum = 0;
        for (int d : dice) {
            if (d == number) sum += number;
        }
        return sum;
    }
	
}