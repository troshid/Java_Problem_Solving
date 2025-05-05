package com.essential.problem.solving;

public class ArmstrongNumberChecker {


        public static boolean isArmstrong(int number) {
            int originalNumber = number;
            int sum = 0;


            int numDigits = String.valueOf(number).length();


            while (number != 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numDigits);
                number /= 10;
            }

            return sum == originalNumber;
        }

        public static void main(String[] args) {

            int input1 = 153;
            int input2 = 9474;
            int input3 = 123;


            System.out.println(input1 + " is Armstrong? " + isArmstrong(input1));
            System.out.println(input2 + " is Armstrong? " + isArmstrong(input2));
            System.out.println(input3 + " is Armstrong? " + isArmstrong(input3));
        }
    }
