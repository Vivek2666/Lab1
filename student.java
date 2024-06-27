package javaprogram;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner ed = new Scanner(System.in);
        String name;
        int javaScore, mathScore, webTechScore, cnScore, seScore;
        double avg;

        System.out.print("Enter name of Student: ");
        name = ed.next();

        System.out.println("Now, Number Out of 100 in the following subjects:");
        System.out.print("Java: ");
        javaScore = ed.nextInt();
        System.out.print("Maths: ");
        mathScore = ed.nextInt();
        System.out.print("Web Technologies: ");
        webTechScore = ed.nextInt();
        System.out.print("Computer Network: ");
        cnScore = ed.nextInt();
        System.out.print("Software Engineering: ");
        seScore = ed.nextInt();

        avg = (javaScore + mathScore + webTechScore + cnScore + seScore) / 5.0;
        System.out.println("Average marks obtained: " + avg);
        System.out.println("Your Grade: " + getGrade(avg));
    }

    private static String getGrade(double avg) {
        if (avg >= 80) {
            return "A";
        } else if (avg >= 60) {
            return "B";
        } else if (avg >= 30) {
            return "C";
        } else {
            return "D";
        }
    }
}