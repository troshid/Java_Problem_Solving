package com.essential.problem.solving;

    import java.util.Scanner;

    public class GradePointCalculator {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter your score (0-100): ");
            int score = scanner.nextInt();

            int gradePoint;
            String grade;


            if (score < 0 || score > 100) {
                System.out.println("Invalid input. Score must be between 0 and 100.");
            } else {

                if (score >= 90) {
                    gradePoint = 4;
                    grade = "A";
                } else if (score >= 80) {
                    gradePoint = 3;
                    grade = "B";
                } else if (score >= 70) {
                    gradePoint = 2;
                    grade = "C";
                } else if (score >= 60) {
                    gradePoint = 1;
                    grade = "D";
                } else {
                    gradePoint = 0;
                    grade = "F";
                }

                System.out.println("Your grade: " + grade);
                System.out.println("Grade point: " + gradePoint);
            }


            scanner.close();
        }
    }

