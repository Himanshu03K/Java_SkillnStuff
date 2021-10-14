package Assignment_4;

import java.util.Scanner;

/*
Ques.2 Create a Student Registration System Of College using private field and also implement with public mehtods .
You have to also use Constructors and public methods for this .also display registration slip after submitting details.
Hint(Student Name,dob,age,course,marks);
 */
public class Q2 {
    private String Student_Name,course,dob;
    private int age,marks;

    public Q2(String Student_Name, String course, String dob, int age, int marks) {
        this.Student_Name = Student_Name;
        this.course = course;
        this.dob = dob;
        this.age = age;
        this.marks = marks;
    }
    public void display(){
        System.out.println("Name: "+Student_Name +"\nCourse: "+course+"\nDate of Birth: "+dob+"\nAge: "+age+"\nMarks : "+marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String s= sc.nextLine();
        System.out.println("Enter Course");
        String s1= sc.nextLine();
        System.out.println("Enter Date of Birth");
        String n = sc.nextLine();
        System.out.println("Enter the age of Student");
        int n1 = sc.nextInt();
        System.out.println("Enter the Marks of Student");
        int n2 = sc.nextInt();
        Q2 obj = new Q2(s,s1,n,n1,n2);
        obj.display();
    }
}
