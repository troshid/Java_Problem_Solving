package com.essential.problem.solving;

    import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

    public class LargestNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            ArrayList<Integer> numbers = new ArrayList<>();

            System.out.println("Enter 10 integers:");


            for (int i = 0; i < 10; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int input = scanner.nextInt();
                numbers.add(input);
            }


            int largest = Collections.max(numbers);


            System.out.println("\nThe largest number is: " + largest);


            scanner.close();
        }
    }


