package BuiltInFunctions.PracticeSheet2;

import java.util.Scanner;

public class Ques_3 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num + (isPrime(num) ? " is Prime" : " is not Prime"));
        sc.close();
    }
}