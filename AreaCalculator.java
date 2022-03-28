package com.company;
import java.util.Scanner;

public class AreaCalculator {

    public static double areasquare(double side) {
        double area = side * side;
        return area;
    }

    public static double areaRectangle(double length, double breadth) {
        double arearec = length * breadth;
        return arearec;
    }

    public static double areaTriangle(double base, double height) {
        double areatri = (base * height) * 2d;
        return areatri;
    }

    public static double areacircle(double radius) {
        double areacir = (radius * radius) * 3.17d;
        return areacir;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 – Square\n2 – Rectangle\n3 – Triangle\n4 – Circle\n");
        int num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("Enter the side length of the square");
                double sidesq = scan.nextDouble();
                double squarearea = areasquare(sidesq);
                System.out.println("Area of square: " + squarearea);
                break;

            case 2:
                System.out.println("Enter the side length and breadth of rectangle");
                double rectlen = scan.nextDouble();
                double rectbre = scan.nextDouble();
                double rectanglearea = areaRectangle(rectlen, rectbre);
                System.out.println("Area of Rectangle: " + rectanglearea);
                break;

            case 3:
                System.out.println("Enter the side of base and height of the triangle");
                double tribase = scan.nextDouble();
                double trihei = scan.nextDouble();
                double trianglearea = areaTriangle(tribase, trihei);
                System.out.println("Area of Triangle: " + trianglearea);
                break;

            case 4:
                System.out.println("Enter the radius of the circle");
                double cirrad = scan.nextDouble();
                double circlearea = areacircle(cirrad);
                System.out.println("Area of circle: " + circlearea);
                break;

            default:
                System.out.println("Enter the valid response");
                break;

        }
    }
}

