
package com.LickingHeights;

        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userDay, userMonth, userYear, userYearMod100, userYearDiv100, q, m, Zeller, h, k;

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

            userYearMod100 = k % 100;

            userYearDiv100 = k / 100;

            Zeller = 13 * (m + 1) / 5;
            h = (q + Zeller + userYearMod100 + (userYearMod100 / 4) + (userYearDiv100 / 4) + 5 * userYearDiv100) % 7;

            // System.out.println(h);
            System.out.println(nurseryRhyme(h));
        }
    }

    public static int monthCalculator(int userMonth) {
        if (userMonth <=2) {
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
