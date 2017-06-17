package com.company;


//Feras Baraka


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;

        int sumOfCubedDigits;

// made my first variables and started the scanner

        Scanner input = new Scanner(System.in);

        System.out.println("I guess you can enter your positive number here, press enter, and I'll sum up the cubes of each digit...");
        while (!input.hasNextInt()) {
            System.out.println("I said a number...");
            input.next();
        }
        number = input.nextInt();
        while (number <= 0) {
            System.out.println("Positive number please...");
            number = input.nextInt();
        }
// above is where I try and validate the input
// Couldn't get it to work with negative numbers for the example 153, so forced it for a positive input.

        int[] digits;
        digits = individualDigits(number);


        sumOfCubedDigits = cubeIndividualDigits(digits);

//showing the programs work for the user

        System.out.println("the sum of the digits, individually cubed is..." + sumOfCubedDigits);
        System.out.println("Is " + number + " = " + sumOfCubedDigits + "?");

//showing the true or false statement required

        if (number == sumOfCubedDigits){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
//how I separated the input number and summed the cubes of the digits, found this solution later.

    static int[] individualDigits(int number){
        char[] digitsAsChars = String.valueOf(number).toCharArray();
        int[] digits = new int[digitsAsChars.length];
        for(int i=0; i< digitsAsChars.length; i++){
            digits[i] = digitsAsChars[i]-48;
        }
        return digits;
    }

    static int cubeIndividualDigits(int[] digits){
        int sumOfCubedDigits = 0;
        for (int digit : digits){
            digit = digit * digit * digit;
            sumOfCubedDigits += digit;
        }
        return sumOfCubedDigits;
    }
}
