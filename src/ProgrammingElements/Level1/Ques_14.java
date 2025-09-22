package ProgrammingElements.Level1;

import java.util.Scanner;

public class Ques_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceFeet = input.nextDouble();

        double distanceYards = distanceFeet / 3.0;
        double distanceMiles = distanceYards / 1760.0;

        System.out.println("The distance of " + String.format("%.2f", distanceFeet) + " feet is " +
                           String.format("%.2f", distanceYards) + " yards and " +
                           String.format("%.5f", distanceMiles) + " miles.");

        input.close();
    }
}