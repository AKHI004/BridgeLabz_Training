package ProgrammingElements.Level1;

import java.util.Scanner;

public class Ques_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price of the item (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity to be bought: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + String.format("%.2f", totalPrice) +
                           " if the quantity is " + quantity + " and unit price is INR " +
                           String.format("%.2f", unitPrice));

        input.close();
    }
}