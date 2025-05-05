package com.essential.problem.solving;

    import java.util.Scanner;

    public class SumOfEvenNumbers {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter a positive integer: ");
            int n = scanner.nextInt();

            int sum = 0;


            if (n < 1) {
                System.out.println("Please enter a positive integer greater than 0.");
            } else {

                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        sum += i;
                    }
                }

                System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);
            }

            scanner.close();
        }
    }
