package Assignment_2;
/*
Ques3. Write a program to Calculate the factorial of given number.

 */
import java.util.Scanner;

public class Q3 {
    int facto(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Q3 obj=new Q3();
        System.out.println("ENTER THE NUMBER");
        int N=sc.nextInt();
        System.out.println("The factorial of given number :"+obj.facto(N));
    }
}