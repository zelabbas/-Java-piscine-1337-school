package com.zelabbas.Module00.ex04;

import java.util.*;

public class Program {

    private static final int TopSize = 10;

    public static int[] getCountChars(String input) {
        int[] charsCount = new int[65535];
        for (int i = 0; i < input.length(); i++) {
            charsCount[input.charAt(i)]++;
        }
        return charsCount;
    }

    public static void insertAt(char[] arr, char value, int position) {
        if (position < 0 || position >= arr.length) {
            System.err.println("Invalid position");
            return;
        }

        // Shift elements to the right starting from the end
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        // Insert the value
        arr[position] = value;
    }

    public static char[] getTenTop(int[] array) {
        char[] chars = new char[TopSize];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                for (int j = 0; j < TopSize; j++) {
                    if (array[chars[j]] < array[i]) {
                        insertAt(chars, (char) i, j);
                        break;
                    }
                }
            }
        }
        return chars;
    }

    public static void displayGraphs(int[] countArray, char[] topTen) {
        System.out.println(countArray[topTen[0]]);
        for (int level = 10; level >= 1; level--) {
            for (int i = 0; i < TopSize; i++) {
                int score = (int) Math.floor(10.0 * countArray[topTen[i]] / countArray[topTen[0]]);
                if (score >= level) {
                    System.out.print("#   ");
                } else if (score + 1 >= level) {
                    System.out.print(countArray[topTen[i]] + "  ");
                } else {
                    System.out.print("    "); // 2 spaces to align with!
                }
            }
            System.out.println();
        }

        for (int i = 0; i < topTen.length; i++) {
            if (topTen[i] > 0)
                System.out.print(topTen[i] + "   ");
        }
    }

    public static void main(String[] args) {

        // AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASSSSSSSSSSSSSSSSSSSSSSSSDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDWEWWKFKKDKKDSKAKLSLDKSKALLLLLLLLLLRTRTETWTWWWWWWWWWWOOOOOOO42
        int[] charsCount;
        char[] topTen;
        Scanner scanner = new Scanner(System.in);
        System.out.print("-> ");
        String input = scanner.nextLine(); // Read input string with trailing \n

        charsCount = getCountChars(input);
        topTen = getTenTop(charsCount);

        displayGraphs(charsCount, topTen);
    }
}