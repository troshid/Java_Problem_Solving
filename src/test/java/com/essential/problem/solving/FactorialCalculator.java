package com.essential.problem.solving;

    import java.util.Scanner;

    public class FactorialCalculator {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a non-negative integer: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                int factorial = 1;
                int i = n;

                while (i > 1) {
                    factorial *= i;
                    i--;
                }

                System.out.println("Factorial of " + n + " is: " + factorial);
            }
            scanner.close();
        }
    }
