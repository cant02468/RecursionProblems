package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n\nHello RecursionProblems!\n");

        //Write a recursive function to calculate factorial(n)
        System.out.print("\nWhat number do you find the factorial of? ");
        System.out.println("The factorial of that value is " + factorial(sc.nextInt()) + ".");

        //Write a recursive function to calculate fibonacci(n)
        System.out.print("\nWhat number of the fibonacci sequence do you want to find? ");
        System.out.println("The number in that part of the fibonacci sequence is " + fibonacci(sc.nextInt()) + ".");

        //Write a recursive function output(word, n) to output a word n times
        System.out.print("\nWhat word do you want repeated? ");
        String word = sc.next();
        System.out.print("How many times do you want it repeated? ");
        System.out.println(output(word, sc.nextInt()));

        //Write a recursive function to calculate the length of an ArrayList without using ArrayList.size()
        ArrayList<Integer> randomArray =  new ArrayList<>(Arrays.asList(1,2,3,5,7));
        System.out.println("\nThe randomArray ArrayList is " + arrayLength(randomArray) + " elements long.");

        //Write a recursive function to calculate sum(a,b)
        System.out.print("\nWhat are the two numbers you want to find the sum of? ");
        System.out.println(sum(sc.nextInt(),sc.nextInt()));

        //Write a recursive function to calculate exponentiation(base, power)
        System.out.print("\nPlease input the first number (base). ");
        int base = sc.nextInt();
        System.out.print("Please input the second number (power). ");
        int power = sc.nextInt();
        System.out.println(base + " to the power of " + power + " is " + exponentiation(base,power));

        //Write a recursive function to count the number of occurrences of character [C] in a String
        System.out.println("\nPlease input a String");
        String exampleString = sc.next();
        System.out.println("What is the character that you want to count the number of occurrences for the previous String?");
        String exampleCharacter= sc.next();
        System.out.println(exampleString + " contains " + characterOccurrence(exampleString, exampleCharacter) + " occurrences of the character " + exampleCharacter);
    }

    private static int characterOccurrence(String exampleString, String character) {
        if (exampleString.isEmpty()) return 0;
        if (exampleString.indexOf(character) ==  0) return 1 + characterOccurrence(exampleString.substring(1), character);
        return characterOccurrence(exampleString.substring(1), character);
    }

    private static int exponentiation(int base, int power) {
        if (power == 0) return 1;
        return base * exponentiation(base, power - 1);
    }

    private static int sum(int i, int j) {
        if(i > 0) return 1 + sum(i-1,j);
        return j;
    }

    private static int arrayLength(ArrayList arrayList) {
        if (arrayList.isEmpty()) return 0;
        arrayList.remove(0);
        return 1 + arrayLength(arrayList);
    }

    private static String output(String word, int i) {
        if (i == 1) return word;
        return word + output(word, i-1);
    }

    private static int fibonacci(int i) {
        if (i == 1 || i == 0) return i;
        return fibonacci(i-1) + fibonacci(i-2);
    }

    private static int factorial(int i) {
        if (i == 1 || i == 0) return 1;
        return i * factorial(i-1);
    }
}
