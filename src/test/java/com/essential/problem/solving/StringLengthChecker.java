package com.essential.problem.solving;

    import java.util.Scanner;

    public class StringLengthChecker {


        public static int getLength(String input) {
            return input.length();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter string " + i + ": ");
                String userInput = scanner.nextLine();

                int length = getLength(userInput);
                System.out.println("Length of string " + i + " is: " + length);
            }

            scanner.close();
        }
    }
