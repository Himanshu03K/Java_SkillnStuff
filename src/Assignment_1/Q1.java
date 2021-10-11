package Assignment_1;/*
Assignment_1.Q1. Write a program to check the input number is greater then 100 and less then 500 is even or odd?
 */


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n>100 && n<500)
        {
            if(n%2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }
        else
            System.out.println("Invalid input");
    }
}
