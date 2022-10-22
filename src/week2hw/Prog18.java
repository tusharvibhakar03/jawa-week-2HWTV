package week2hw;

import java.util.Scanner;

public class Prog18 {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = scanner.nextInt();
        Prog18 printOperation = new Prog18();
        printOperation.printTheOperation(firstNumber, secondNumber);
        //Closing the scanner object
        scanner.close();
    }

    //Printing the all operations
    public void printTheOperation(int a, int b) {
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
        System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
        System.out.println("The product of " + a + " and " + b + " is " + (a * b));
        System.out.println("The division of " + a + " and " + b + " is " + (a / b));
        System.out.println("The remainder of " + a + " and " + b + " is " + (a % b));
    }
}


