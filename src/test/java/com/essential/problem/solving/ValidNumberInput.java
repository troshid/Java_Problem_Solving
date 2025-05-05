package com.essential.problem.solving;

    import java.util.Scanner;

    public class ValidNumberInput {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int number;


            do {
                System.out.print("Enter a number between 1 and 100: ");
                number = scanner.nextInt();

                if (number < 1 || number > 100) {
                    System.out.println("Invalid input. Please try again.");
                }
            } while (number < 1 || number > 100);


            System.out.println("Valid");


            scanner.close();
        }
    }
