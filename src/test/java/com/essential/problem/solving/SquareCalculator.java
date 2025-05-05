package com.essential.problem.solving;

    import java.util.Scanner;

    public class SquareCalculator {


        public static int square(int number) {
            return number * number;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter an integer: ");
            int input = scanner.nextInt();


            int result = square(input);


            System.out.println("The square of " + input + " is: " + result);

            scanner.close();
        }
    }
