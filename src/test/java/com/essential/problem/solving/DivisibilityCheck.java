package com.essential.problem.solving;

    import java.util.Scanner;

    public class DivisibilityCheck {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Divisible");
            } else {
                System.out.println("Not Divisible");
            }

            scanner.close();
        }
    }
