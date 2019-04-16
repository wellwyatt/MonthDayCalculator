package com.LickingHeights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userDay, userMonth, userYear, K, J, q, m, W, h, k;

        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("What is the month of your Birthday (as a number)");
            userMonth = keyboard.nextInt();
            m = userMonth;

            System.out.println("What is the date of your Birth?");
            userDay = keyboard.nextInt();


            System.out.println("What year were you born?");
            userYear = keyboard.nextInt();
            k = userYear;


            k = yearCalculator(k, m);

            m = monthCalculator(m);

            q = userDay;

            K = k % 100;

            J = k / 100;

            W = 13 * (m + 1) / 5;
            h = (q + W + K + (K / 4) + (J / 4) + 5 * J) % 7;

            System.out.println(h);
            System.out.println(dayOfTheWeekCalculator(h));
        }
    }

    public static int monthCalculator(int userMonth) {
        if (userMonth == 1) {
            return userMonth + 12;
        } else if (userMonth == 2) {
            return userMonth + 12;
        }
        return userMonth;
    }

    public static int yearCalculator(int userYear, int userMonth) {
        if (userMonth <= 2) {
            userYear = userYear - 1;

        }

        return userYear;

    }

    public static String dayOfTheWeekCalculator(int h) {
        switch (h) {
            case 0:
                return "Saturday's child works hard for a living. ";
            case 1:
                return "Sunday's child, born on Sabbath Day, is fair and wise and good in every way. ";
            case 2:
                return "Monday's child is fair of face.";
            case 3:
                return "Tuesday's child is full of grace.";
            case 4:
                return "Wednesday's child is full of woe.";
            case 5:
                return "Thursday's child has far to go.";
            case 6:
                return "Friday's child is loving and giving.";
        }

        return null;
    }

}

