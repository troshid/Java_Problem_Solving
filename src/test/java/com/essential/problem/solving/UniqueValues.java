package com.essential.problem.solving;

    import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

    public class UniqueValues {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            ArrayList<Integer> numbers = new ArrayList<>();

            System.out.println("Enter 5 integers:");

            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int input = scanner.nextInt();
                numbers.add(input);
            }

            System.out.println("\nUnique values:");
            for (Integer number : numbers) {
                if (Collections.frequency(numbers, number) == 1) {
                    System.out.println(number);
                }
            }


            scanner.close();
        }
    }
