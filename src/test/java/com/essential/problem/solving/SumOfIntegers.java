package com.essential.problem.solving;

    import java.util.ArrayList;
import java.util.Scanner;

    public class SumOfIntegers {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            ArrayList<Integer> numbers = new ArrayList<>();

            int input;
            System.out.println("Enter integers (enter 0 to stop):");


            do {
                input = scanner.nextInt();
                if (input != 0) {
                    numbers.add(input);
                }
            } while (input != 0);


            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }


            System.out.println("Sum of entered numbers: " + sum);


            scanner.close();
        }
    }
