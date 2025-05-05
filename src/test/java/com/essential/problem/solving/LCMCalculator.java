package com.essential.problem.solving;

public class LCMCalculator {


        public static int computeGCD(int a, int b) {
            a = Math.abs(a);
            b = Math.abs(b);
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static int computeLCM(int a, int b) {
            if (a == 0 || b == 0) return 0;

            return Math.abs(a * b) / computeGCD(a, b);
        }

        public static void main(String[] args) {

            int a1 = 12, b1 = 18;
            int a2 = 7, b2 = 5;
            int a3 = 21, b3 = 6;


            System.out.println("LCM of " + a1 + " and " + b1 + " is: " + computeLCM(a1, b1));
            System.out.println("LCM of " + a2 + " and " + b2 + " is: " + computeLCM(a2, b2));
            System.out.println("LCM of " + a3 + " and " + b3 + " is: " + computeLCM(a3, b3));
        }
    }
