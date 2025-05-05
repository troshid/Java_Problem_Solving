package com.essential.problem.solving;

public class EvenNumberCheck {


        public static boolean isEven(int number) {
            return number % 2 == 0;
        }

        public static void main(String[] args) {
            int input1 = 4;
            int input2 = 7;
            int input3 = 0;


            System.out.println("Is " + input1 + " even? " + isEven(input1));
            System.out.println("Is " + input2 + " even? " + isEven(input2));
            System.out.println("Is " + input3 + " even? " + isEven(input3));
        }
    }
