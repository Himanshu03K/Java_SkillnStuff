package Assignment_4;

import java.util.Scanner;

/*
Ques 1. Create a Program Which describes a functionality of Car .create a private field for attribute of Car and also implement
a seperate method for displaying a data of Car.
Hint : (Attributes : Car_Model,color,Price,Avg. Milege) mileage

 */
public class Car {
    private String Car_Model,Color;
    private int Price,Avg,Mileage;

    public void setCar_Model(String car_Model) {
        Car_Model = car_Model;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setAvg(int avg) {
        Avg = avg;
    }

    public void setMileage(int mileage) {
        Mileage = mileage;
    }

    public String getCar_Model() {
        return Car_Model;
    }

    public String getColor() {
        return Color;
    }

    public int getPrice() {
        return Price;
    }

    public int getAvg() {
        return Avg;
    }

    public int getMileage() {
        return Mileage;
    }

    public void functionality() {
        System.out.println("Car Model: "+getCar_Model());
        System.out.println("Color of Car: "+getColor());
        System.out.println("Price of Car : Rs "+getPrice());
        System.out.println("Average of Car : "+getAvg());
        System.out.println("Mileage of CAr : "+getAvg());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car obj = new Car();
        System.out.println("Enter Car Model");
        obj.setCar_Model(sc.nextLine());
        System.out.println("Enter Color of Car");
        obj.setColor(sc.nextLine());
        System.out.println("Enter Price of Car");
        obj.setPrice(sc.nextInt());
        System.out.println("Enter Average of Car");
        obj.setAvg(sc.nextInt());
        System.out.println("Enter Mileage of Car");
        obj.setMileage(sc.nextInt());

        obj.functionality();
    }
}
