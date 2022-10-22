package week2hw;

import java.util.Scanner;

public class Prog6 {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        double radius = scanner.nextDouble();
        areaOfCircle(radius);
        // closing the scanner object
        scanner.close();
    }

    // Calculating the area of circle
    public static void areaOfCircle(double radius) {
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area of Circle is : " + area);
    }
}


