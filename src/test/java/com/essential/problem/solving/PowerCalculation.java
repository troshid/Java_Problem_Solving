package com.essential.problem.solving;

    public class PowerCalculation {


        public static int power(int base, int exponent) {
            int result = 1;


            if (exponent < 0) {
                System.out.println("This method only supports non-negative exponents.");
                return -1;
            }

            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }

            return result;
        }

        public static void main(String[] args) {

            int base1 = 2, exponent1 = 3;
            int base2 = 5, exponent2 = 0;
            int base3 = 3, exponent3 = 4;


            System.out.println(base1 + "^" + exponent1 + " = " + power(base1, exponent1));
            System.out.println(base2 + "^" + exponent2 + " = " + power(base2, exponent2));
            System.out.println(base3 + "^" + exponent3 + " = " + power(base3, exponent3));
        }
    }
