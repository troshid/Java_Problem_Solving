package com.essential.problem.solving;

    import java.util.Scanner;

    public class ArithmeticOperation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case '/':
                    if (num2 != 0) {
                        result = (double) num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                default:
                    System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
            }

            scanner.close();
        }
    }
