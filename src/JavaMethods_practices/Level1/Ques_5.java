package JavaMethods_practices.Level1;

import java.util.Scanner;

public class Ques_5 {

    public static boolean isSpring(int m, int d) {
        return (m == 3 && d >= 20) || (m == 4) || (m == 5) || (m == 6 && d <= 20);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        if (isSpring(m, d)) System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
        sc.close();
    }
}