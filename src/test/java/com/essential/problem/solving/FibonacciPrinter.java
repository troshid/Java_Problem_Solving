package com.essential.problem.solving;

import java.util.Scanner;

    public class FibonacciPrinter {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter how many Fibonacci numbers to print: ");
            int n = scanner.nextInt();

            int first = 0, second = 1;

            System.out.println("First " + n + " Fibonacci numbers:");
            for (int i = 0; i < n; i++) {
                System.out.print(first + " ");

                int next = first + second;

                first = second;
                second = next;
            }
            scanner.close();
        }
    }

