package com.essential.problem.solving;

public class GCDCalculator {


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

        public static void main(String[] args) {

            int a1 = 48, b1 = 18;
            int a2 = 100, b2 = 25;
            int a3 = 81, b3 = 27;


            System.out.println("GCD of " + a1 + " and " + b1 + " is: " + computeGCD(a1, b1));
            System.out.println("GCD of " + a2 + " and " + b2 + " is: " + computeGCD(a2, b2));
            System.out.println("GCD of " + a3 + " and " + b3 + " is: " + computeGCD(a3, b3));
        }
    }
