package ProgrammingElements.Level1;

import java.util.Scanner;

public class Ques_8 {
    public static void main(String[] args) {
        double km, miles;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        km = sc.nextDouble();

        miles = km / 1.6;

        System.out.println("The total miles is " + String.format("%.2f", miles) +
                           " mile for the given " + String.format("%.2f", km) + " km");

        sc.close();
    }
}