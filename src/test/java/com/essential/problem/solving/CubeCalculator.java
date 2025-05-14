package com.essential.problem.solving;

public class CubeCalculator {

        public static int cube(int number) {
            return number * number * number;
        }

        public static void main(String[] args) {
            int input = 5;
            int result = cube(input);
            System.out.println("The cube of " + input + " is: " + result);
        }
    }
