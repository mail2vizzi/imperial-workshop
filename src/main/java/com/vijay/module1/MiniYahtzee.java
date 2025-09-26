package com.vijay.module1;

class MiniYahtzee {

    public static void main(String[] args) {
    	args = new String[] {"ones", "1", "1", "1"};
        System.out.println(new DiceScores().score(args[0], args[1], args[2], args[3]));
    }
    
 }




