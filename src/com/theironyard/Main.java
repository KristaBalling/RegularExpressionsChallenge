package com.theironyard;

public class Main {

    public static void main(String[] args) {
    String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        String regExp = "I want a \\w+.";
        System.out.println(challenge1.matches(regExp));
        String challenge2 = "I want a ball.";
        System.out.println(challenge2.matches(regExp));

        String regExp1 = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regExp1));
        System.out.println(challenge2.matches(regExp1));




    }
}
