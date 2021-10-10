/*
Q2. write a program to check entered character is vowel or not?
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character ");
        char ch = sc.next().charAt(0);
        if(Character.isLetter(ch)) {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'u')
                System.out.println("Character is Vowel");
            else
                System.out.println("Character is Consonant");
        }
        else
            System.out.println("Invalid input \nInput must be Character only");
    }
}
