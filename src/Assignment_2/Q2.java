package Assignment_2;
/*
Ques2. Write a program to calculate the sum of first 10 natural number.
 */
public class Q2 {
    public static void main(String[] args) {
        int n=10,sum =0;
        for (int i = 1; i <= n; i++)
            sum =sum+i;
        System.out.println("The sum of first 10 natural number : "+sum);
    }
}
