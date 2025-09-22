package String2_practice;

import java.util.Scanner;

public class Ques_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length()) longest = w;
        }
        System.out.println("Longest Word: " + longest);
        sc.close();
    }
}