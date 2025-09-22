package ProgrammingElements.Level2;

import java.util.Scanner;

public class Ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + String.format("%.2f", side) +
                           " whose perimeter is " + String.format("%.2f", perimeter));

        sc.close();
    }
}