package Assignment_5;

import java.util.Scanner;

/*
Ques 1. Create a Simple Banking System where user can acess his Account and it's Functionality.
 Create Seperate Method for each operation.
 --> Account Information(included User Info)
 --> Password Generate
 --> WithDraw Amount
 --> Deposite In Account
 --> Check Balance
 */
public class Q1 {
    public String name, address, dob;
    public int age;
    private double balance;
    private int acc_number ;
    private String password;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAcc_number() {
        for (int i = 1; i <= 12; i++) {
            acc_number=acc_number*10 +(int)(Math.random()*9);
        }
        return Math.abs(acc_number);
    }

    public void Input_Information(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Details ");
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Date of Birth: ");
        dob = sc.nextLine();
        System.out.println("Enter your Address: ");
        address = sc.nextLine();
        System.out.println("Enter the initial balance of your account");
        setBalance(sc.nextDouble());
        sc.nextLine();
        System.out.println("Enter your Password for bank account: ");
        setPassword(sc.nextLine());
    }

    public void withdraw(double amt){
        if(balance> amt){
            balance = balance-amt;
            System.out.println("\t\tTransition Successful \nYour available balance is: "+balance);
        }
        else{
            System.out.println("Sorry insufficient balance");
        }
    }
    public void deposit(double amt){
        balance = balance+amt;
        System.out.println("Your Account Balance is: "+ balance);
    }

    public void check_balance(){
        System.out.println("Your balance is : "+ balance);
    }

    public boolean check_password(String str){
        if(str.compareTo(password)==0)
            return true;
        return false;
    }

    public void displayInformation(){
        System.out.println("Name : "+name+"\nAge : "+age+"\nDate of Birth : "+dob+"\nAddress : "+address);
        System.out.println("Account Number : "+getAcc_number());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q1 obj= new Q1();
        System.out.println("\t\tWelcome to Bank of Himanshu ");

        obj.Input_Information();
        System.out.println("Enter 1 to Withdraw Amount or Enter 2 to Deposit Amount or Enter 3 to Check balance");
        int c = sc.nextInt();
        sc.nextLine();
        if(c ==1){
            System.out.println("Enter the amount to be Withdraw");
            double r= sc.nextDouble();
            sc.nextLine();
            System.out.println("Please enter the password to Confirm the process");
            String s = sc.nextLine();
            if(obj.check_password(s)) {
                obj.displayInformation();
                obj.withdraw(r);
            }
            else
                System.out.println("Wrong Password \nPlease try again");
        }
        else if(c ==2){
            System.out.println("Enter the amount to be Deposit");
            double r= sc.nextDouble();
            sc.nextLine();
            System.out.println("Please enter the password to Confirm the process");
            String s = sc.nextLine();
            if(obj.check_password(s)) {
                obj.displayInformation();
                obj.deposit(r);
            }
            else
                System.out.println("Wrong Password \nPlease try again");
        }
        else {
            System.out.println("Please enter the password to Confirm the process");
            String s = sc.nextLine();
            if(obj.check_password(s)) {
            obj.check_balance();
            }
            else
                System.out.println("Wrong Password \nPlease try again");
        }
    }
}
