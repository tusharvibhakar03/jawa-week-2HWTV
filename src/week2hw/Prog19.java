package week2hw;

import java.util.Scanner;

public class Prog19 {
    static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence: ");
        String uppercase = scanner.nextLine();
        Prog19 t = new Prog19();
        t.convertStringToLowerCase(uppercase);
        //Closing the scanner object
        scanner.close();

    }

    // Convert string the to lower case
    public void convertStringToLowerCase(String str) {
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());
    }
}


