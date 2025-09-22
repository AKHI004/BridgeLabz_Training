package ProgrammingElements.Level1;

import java.util.Scanner;

public class Ques_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your height in cm is " + String.format("%.2f", heightCm) +
                           ", which is approximately " + feet + " feet and " +
                           String.format("%.2f", inches) + " inches.");

        sc.close();
    }
}