package com.LickingHeights;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userDay, userMonth, userYear, K;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the date of your Birth?");
        userDay = keyboard.nextInt();

        System.out.println("What is the month of your Birthday (as a number)");
        userMonth = keyboard.nextInt();

        System.out.println("What year were you born?");
        userYear = keyboard.nextInt();

        System.out.println(monthCalculator(userMonth));
    }

    public static int monthCalculator(int userMonth) {
        if (userMonth == 1) {
            return userMonth + 13;
        } else if (userMonth == 2) {
            return userMonth + 12;
        }
        return userMonth ;



    }
public static int yearCalculator(int userYear){
        K = userYear%100;

}


}
