package com.rpg.thare.utils;
public class diceRolls {

    public static int rollD4(int num){
        int total = 0;
        System.out.println("You rolled " + num + " 4 sided dice and the results were...");
        for(int i = 0; i < num; i++ ){
            int roll = getRandom(1,4);
            System.out.println("Roll " + (i + 1) + " is " + roll);
            total = total + roll;
        }
        return total;
    }

    public static int rollD6(int num){
        int total = 0;
        System.out.println("You rolled " + num + " 6 sided dice and the results were...");
        for(int i = 0; i < num; i++ ){
            int roll = getRandom(1,6);
            System.out.println("Roll " + (i + 1) + " is " + roll);
            total = total + roll;
        }
        return total;
    }

    public static int rollD8(int num){
        int total = 0;
        System.out.println("You rolled " + num + " 8 sided dice and the results were...");
        for(int i = 0; i < num; i++ ){
            int roll = getRandom(1,8);
            System.out.println("Roll " + (i + 1) + " is " + roll);
            total = total + roll;
        }
        return total;
    }

    public static int rollD10(int num){
        int total = 0;
        System.out.println("You rolled " + num + " 10 sided dice and the results were...");
        for(int i = 0; i < num; i++ ){
            int roll = getRandom(1,10);
            System.out.println("Roll " + (i + 1) + " is " + roll);
            total = total + roll;
        }
        return total;
    }

    public static int rollD12(int num){
        int total = 0;
        System.out.println("You rolled " + num + " 12 sided dice and the results were...");
        for(int i = 0; i < num; i++ ){
            int roll = getRandom(1,12);
            System.out.println("Roll " + (i + 1) + " is " + roll);
            total = total + roll;
        }
        return total;
    }

    public static int rollD20(int num){
        int total = 0;
        System.out.println("You rolled " + num + " 20 sided dice and the results were...");
        for(int i = 0; i < num; i++ ){
            int roll = getRandom(1,20);
            System.out.println("Roll " + (i + 1) + " is " + roll);
            total = total + roll;
        }
        return total;
    }

    public static int rollD100(int num){
        int total = 0;
        System.out.println("You rolled " + num + " 100 sided dice and the results were...");
        for(int i = 0; i < num; i++ ){
            int roll = getRandom(1,100);
            System.out.println("Roll " + (i + 1) + " is " + roll);
            total = total + roll;
        }
        return total;
    }
    public static int getRandom(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}