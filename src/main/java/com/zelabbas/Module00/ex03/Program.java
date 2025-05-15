package com.zelabbas.Module00.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program {

    // Static ArrayList initialized with the weeks
    private static final ArrayList<String> weekList = new ArrayList<>(
            Arrays.asList("Week 1", "Week 2", "Week 3", "Week 4", "Week 5",
                    "Week 6", "Week 7", "Week 8", "Week 9", "Week 10", "Week 11", "Week 12") // ... Week 18 is the end!
    );

    public static void checkWeek(String week, int order) {
        int position = weekList.indexOf(week);
//        System.out.println("position: " + position + " order: " + order + " week: " + week);
        if (position == -1 || position != order) {
            System.err.println("Invalid week: " + week);
            System.exit(-1);
        }
    }

    public static int ft_min(Scanner scanner) {
        int min = Integer.MAX_VALUE;
        if (!scanner.hasNextInt())
            min = 0;
        try {
            while (scanner.hasNext()) {
                String token = scanner.next();
                try {
                    int value = Integer.parseInt(token);
//                    System.out.println("value: " + value);
                    min = Math.min(min, value);
                } catch (NumberFormatException e) {
                    // The input was not a valid integer (too big, letters, etc.)
                    System.err.println("Invalid input: " + token + " (not a valid int)");
                    System.exit(-1);
                }
            }
        } catch (Exception e) {
            System.err.println("Something went wrong! Try again");
            System.exit(-1);
        }

        System.out.println("min: " + min);
        return min;
    }



    public static void main(String[] args) {

        String week;
        String data;
        int order = 0;
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
            System.out.print("-> ");
            week = scanner.nextLine();
            if (week.equals("42"))
                break;
            checkWeek(week, order);
            System.out.print("-> ");
            data = scanner.nextLine();
            score = ft_min(new Scanner(data));
            for (int i = 0; i < score; i++) {
                System.out.print("=");
            }
            System.out.println(">");
            order++;
            }catch (Exception e) {
                System.err.println("ops Something went wrong");
                System.exit(-1);
            }
        }
    }
}