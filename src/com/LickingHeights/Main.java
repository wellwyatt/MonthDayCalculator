
package com.LickingHeights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userDay, userMonth, userYear, userYearMod100, userYearDiv100, Zeller, h = 0, userYearCal;

        Scanner keyboard = new Scanner(System.in);

        while (true) {
            long color = Math.round(100 * Math.random());
            System.out.println(colorGen(color) + "What is the month of your Birthday (as a number)");
            userMonth = keyboard.nextInt();


            System.out.println("What is the date of your Birth?");
            userDay = keyboard.nextInt();


            System.out.println("What year were you born?");
            userYear = keyboard.nextInt();


            userYearCal = yearCalculator(userYear, userMonth);

            userMonth = monthCalculator(userMonth);

            userYearMod100 = userYearCal % 100;

            userYearDiv100 = userYearCal / 100;

            Zeller = 13 * (userMonth + 1) / 5;
            System.out.println(nurseryRhyme(ZellerCal(userDay, Zeller, userYearMod100, userYearDiv100, h)));
            System.out.println(numOfDays(userMonth, userYear));
        }


    }


    public static int ZellerCal(int userDay, int Zeller, int userYearMod100, int userYearDiv100, int h) {

        return h = (userDay + Zeller + userYearMod100 + (userYearMod100 / 4) + (userYearDiv100 / 4) + 5 * userYearDiv100) % 7;
    }

    public static String numOfDays(int userMonth, int userYear) {
        switch (userMonth) {
            case 13:
                return "In January there are 31 days";
            case 14:
                if (userYear % 400 == 0) {
                    System.out.println("In February there are 29 days");
                } else if (userYear % 100 == 0){
                    System.out.println("In February there are 28 days");
                }
                else if (userYear % 4 == 0) {
                System.out.println("In February there are 29 days ");
            } else {
                System.out.println("In February there are 28 days");
            }
                break;
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
                return "Please enter a month.";
        }

        return "thank you!";

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

    public static String colorGen(long color) {

        if (color <= 10 && color >= 1) {
            return ("\u001B[31m");
        }
        if (color <= 20 && color >= 11) {
            return ("\u001B[32m");
        }
        if (color <= 30 && color >= 21) {
            return ("\u001B[33m");
        }
        if (color <= 40 && color >= 31) {
            return ("\u001B[34m");
        }
        if (color <= 50 && color >= 41) {
            return ("\u001B[35m");
        }
        if (color <= 60 && color >= 51) {
            return ("\033[1;97m");
        }
        if (color <= 70 && color >= 61) {
            return ("\u001B[36m");
        }
        if (color <= 80 && color >= 71) {
            return ("\033[1;95m");
        }
        if (color <= 90 && color >= 80) {
            return ("\033[1;96m");
        }
        if (color <= 100 && color >= 91) {
            return ("\033[1;97m");
        }


        return "\u001B[0m"; //reset colors
    }
}

