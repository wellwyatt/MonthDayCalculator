
package com.LickingHeights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userDay, userMonth, userYear, userYearMod100, userYearDiv100, q, Zeller, h;

        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("What is the month of your Birthday (as a number)");
            userMonth = keyboard.nextInt();



            System.out.println("What is the date of your Birth?");
            userDay = keyboard.nextInt();


            System.out.println("What year were you born?");
            userYear = keyboard.nextInt();


            userYear = yearCalculator(userYear, userMonth);

            userMonth = monthCalculator(userMonth);

            q = userDay;

            userYearMod100 = userYear % 100;

            userYearDiv100 = userYear / 100;

            Zeller = 13 * (userMonth + 1) / 5;
            h = (q + Zeller + userYearMod100 + (userYearMod100 / 4) + (userYearDiv100 / 4) + 5 * userYearDiv100) % 7;

            //System.out.println(m);
            System.out.println(nurseryRhyme(h));
            System.out.println(numOfDays(userMonth));
        }
    }

    public static String numOfDays(int userMonth) {
        switch (userMonth) {
            case 13:
                return "In January there are 31 days";
            case 14:
                return "In February there are 28 days (29 days during leap year) ";
            case 3:
                return "In March there are 31 days.";
            case 4:
                return "In April there are 30 days";
            case 5:
                return "In May there are 31 days.";
            case 6:
                return "In June there are 30 days.";
            case 7:
                return "In July there are 31 days.";
            case 8:
                return "In August there are 31 days.";
            case 9:
                return "In September there are 30 days.";
            case 10:
                return "In October there are 31 days.";
            case 11:
                return "In November there are 30 days";
            case 12:
                return "in December there are 31 days.";
            default:
                return "Please enter a month." + (userMonth);
        }

    }


    public static int monthCalculator(int userMonth) {
        if (userMonth <= 2) {
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

    public static String nurseryRhyme(int h) {
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
            default:
                return "Couldn't find the line.";
        }


    }

}

