package com.zelabbas.Module00.ex02;

import java.util.Scanner;

public class Program {

    public static long sumNumber(int num) {
        long sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static boolean isPrime(long n) {
        if (n < 2)
            return false;

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean startChecker(int n){
        if (!isPrime(sumNumber(n)))
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int counter = 0;
        while (true){
            try {
                System.out.print("-> ");
                n = scanner.nextInt();
                if(startChecker(n))
                    counter++;
                if (n == 42)
                    break;
            }catch (Exception e) {
                System.err.println("please enter a valid input");
                System.exit(-1);
            }
        }

        System.out.println("Count of coffee-request : " + counter);
    }

}