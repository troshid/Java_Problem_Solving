import java.util.Scanner;

public class PoundsToKilogramsConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();


        double conversionFactor = 0.453592;


        double kilograms = pounds * conversionFactor;


        System.out.printf("%.2f pounds is equal to %.2f kilograms.%n", pounds, kilograms);


        scanner.close();
    }
}
