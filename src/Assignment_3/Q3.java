package Assignment_3;

import java.util.Scanner;

/*
Ques 3. Write a program to print a pattern
 if input = 4;
1
12
123
1234
 */
public class Q3 {
    public void pattern(int n){
        for(int i =1;i<=n;i++)
        {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q3 obj = new Q3();
        System.out.println("Enter the number:");
        int x = sc.nextInt();
        obj.pattern(x);
    }
}
