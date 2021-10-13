package Assignment_3;

import java.util.Scanner;

/*
Ques.2 Write a program to calculate the sum of even and odd number in the given number input
Ex : 12345 so sum of Even = 2+4 = 6 and sum of odd = 1+3+5 = 9
 */
public class Q2 {
    public int even(int n){
        int sum =0;
        while(n>0){
            int r = n%10;
            if(r%2 == 0)
                sum =sum+r;
            n = n/10;
        }
        return sum;
    }

    public int odd(int n){
        int sum =0;
        while(n>0){
            int r = n%10;
            if(r%2 != 0)
                sum =sum+r;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q2 obj = new Q2();
        System.out.println("Enter the number:");
        int x = sc.nextInt();
        System.out.println("Sum of even = "+ obj.even(x));
        System.out.println("Sum of odd = "+ obj.odd(x));
    }
}
