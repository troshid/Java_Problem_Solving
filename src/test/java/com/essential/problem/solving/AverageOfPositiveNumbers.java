package com.essential.problem.solving;

    import java.util.ArrayList;
import java.util.Scanner;

    public class AverageOfPositiveNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> numbers = new ArrayList<>();

            System.out.println("Enter integers (enter -1 to stop):");


            while (true) {
                int input = scanner.nextInt();
                if (input == -1) {
                    break;
                }
                numbers.add(input);
            }


            int sum = 0;
            int count = 0;

            for (int number : numbers) {
                if (number > 0) {
                    sum += number;
                    count++;
                }
            }


            if (count > 0) {
                double average = (double) sum / count;
                System.out.println("Average of positive numbers: " + average);
            } else {
                System.out.println("No positive numbers were entered.");
            }

            scanner.close();
        }
    }
