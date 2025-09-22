package ProgrammingElements.Level2;

import java.util.Scanner;

public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is " + String.format("%.2f", distanceInYards) +
                           " while the distance in miles is " + String.format("%.5f", distanceInMiles));

        sc.close();
    }
}