package ProgrammingElements.Level2;

import java.util.Scanner;

public class Ques_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        int result1 = a + b * c;   // multiplication before addition
        int result2 = a * b + c;   // multiplication before addition
        int result3 = c + a / b;   // division before addition
        int result4 = a % b + c;   // modulo before addition

        System.out.println("The results of Int Operations are: ");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        sc.close();
    }
}