package Assignment_4;

import java.util.Scanner;

/*
Ques.3 Implement a basic calculator which have basic operation (+,-,*,/) Make seperate method for all operation.
 */
public class Q3 {
    public int add(int x,int y){
        return x+y;
    }

    public int sub(int x,int y){
        return x-y;
    }

    public int mul(int x, int y){
        return x*y;
    }

    public double div(int x,int y){
        return x/y;
    }

    public void Cal(int x,int y,char ch){
        switch(ch){
            case '+':{
                System.out.println(add(x,y));
                break;
            }
            case '-':{
                System.out.println(sub(x,y));
                break;
            }
            case '*':{
                System.out.println(mul(x,y));
                break;
            }
            case '/':{
                System.out.println(div(x,y));
                break;
            }
            default:{
                System.out.println("Invalid Operand used \nPlease try again");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int x= sc.nextInt();
        System.out.println("Enter Operand");
        char ch = sc.next().charAt(0);
        System.out.println("Enter Second number");
        int y = sc.nextInt();
        Q3 obj=new Q3();
        obj.Cal(x,y,ch);
    }
}
