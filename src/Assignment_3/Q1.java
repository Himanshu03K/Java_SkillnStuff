package Assignment_3;
/*
Ques.1 Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
 For example, if the input is 12345, the output should be 54321.
 */
import java.util.Scanner;

public class Q1 {
    public int rev(int n){
        int rev=0;
        while(n>0){
            int r = n%10;
            rev = rev*10 +r;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q1 obj = new Q1();
        System.out.println("Enter the number ");
        int x = sc.nextInt();
        System.out.println(obj.rev(x));
    }
}
