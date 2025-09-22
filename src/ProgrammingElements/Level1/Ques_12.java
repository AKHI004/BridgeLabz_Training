package ProgrammingElements.Level1;

import java.util.Scanner;

public class Ques_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of the triangle in inches: ");
        double baseInches = sc.nextDouble();

        System.out.print("Enter height of the triangle in inches: ");
        double heightInches = sc.nextDouble();

        double areaInches = 0.5 * baseInches * heightInches;
        double areaCm = areaInches * 6.4516;

        System.out.println("The area of the triangle is " + String.format("%.2f", areaInches) +
                           " square inches and " + String.format("%.2f", areaCm) + " square centimeters.");

        sc.close();
    }
}