package interview;

// Problem Statement:- Write a Java program to print n Random number by using java 8

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N number to generate random numbers: ");
        int n = scanner.nextInt();

        Random random = new Random();

        random.ints(1,100).limit(n).forEach(System.out::println);
    }

}
