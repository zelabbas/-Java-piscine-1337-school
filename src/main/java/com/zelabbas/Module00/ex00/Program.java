package com.zelabbas.Module00.ex00;

public class Program {
    public static void main(String[] args) {
        int num = 479598;

        // we can use n and use it in for loop or while loop
        //int n = String.valueOf(num).length();
        // System.out.println("the length of " + num + " is " + n);
        long sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);
    }
}
