package com.essential.problem.solving;

    import java.util.ArrayList;
import java.util.Scanner;

    public class NumberSearch {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> numbers = new ArrayList<>();

            System.out.println("Enter 10 integers:");


            for (int i = 0; i < 10; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int input = scanner.nextInt();
                numbers.add(input);
            }

            System.out.print("\nEnter a number to search: ");
            int searchNumber = scanner.nextInt();


            int index = numbers.indexOf(searchNumber);


            if (index != -1) {
                System.out.println("Number found at index: " + index);
            } else {
                System.out.println("Not found");
            }

            scanner.close();
        }
    }
