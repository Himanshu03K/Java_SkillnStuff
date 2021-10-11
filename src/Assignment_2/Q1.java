package Assignment_2;

import java.util.Scanner;

/*
Ques.1 .Write a program to calculate HCF of Two given number.
 */
public class Q1 {
    public int HCF(int x,int y){
        int a=1,h=0;
        while(a<=x || a<=y){
            if(x%a == 0 && y%a == 0)
                h= a;
            a++;
        }
    return h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q1 obj = new Q1();
        System.out.println("Enter two numbers");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("H.C.F is: "+ obj.HCF(n,m));
    }
}
