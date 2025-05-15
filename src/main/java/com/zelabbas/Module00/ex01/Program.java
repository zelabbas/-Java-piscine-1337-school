package com.zelabbas.Module00.ex01;

import java.util.Scanner;

public class Program {

    public static  void isPrime(int n) {
        int counter = 0;
        if (n < 2) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }

        for (long i = 2; i * i <= n; i++) {
            counter++;
            if (n % i == 0) {
                System.out.println("false " + counter);
                return;
            }
        }

        System.out.println("true " + (counter + 1));
    }

    public static void main(String[] args) {
        int numberTest = 0;
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many tests do you want to test -> ");
        try {
            numberTest = scanner.nextInt();
        }catch (Exception e) {
            System.err.println("please enter a valid number!");
            System.exit(-1);
        }

        for (int i = 0; i < numberTest ; i++) {
            try {
               System.out.print("Enter number -> ");
               n = scanner.nextInt();
               isPrime(n);
           }catch (Exception e) {
               System.err.println("please enter a valid number!");
               System.exit(-1);
//               e.printStackTrace();
           }
       }
    }
}