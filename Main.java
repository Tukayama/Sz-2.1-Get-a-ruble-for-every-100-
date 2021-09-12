package com.company;

public class Main {

    public static void main(String[] args) {
        int score = 100;
        int AddingMone = 1100;
        // переменная a = бонусу 1р
        int a = 100;
        int bonus;
        int FinalScore;
        if (AddingMone > 1000) {
            bonus = AddingMone / a;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
        System.out.println(FinalScore = score + AddingMone + bonus);
    }

}
