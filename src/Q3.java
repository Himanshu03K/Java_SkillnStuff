/*
Q3.Create a program based on given condition----
 step 1 : enter a marks%(integer)
 step 2: check if mark > 90 then grade is A and print Excellent
 step 3: check if mark >75 < 90 grade is B and print Good
 step 4: check if mark > 60 < 75 grade is C and print Pass
 step 5: else fail

Example : input : 85
Output : Your Grade is B
	Performance : Good
 */
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in percent");
        int marks = sc.nextInt();

        if(marks>=90)
            System.out.println("Your Grade is A \nPerformance : Excellent");
        else if(marks>=75)
            System.out.println("Your Grade is B \nPerformance : Good");
        else if(marks>=60)
            System.out.println("Your Grade is C \nPerformance : Pass");
        else
            System.out.println("Fail");
    }
}
