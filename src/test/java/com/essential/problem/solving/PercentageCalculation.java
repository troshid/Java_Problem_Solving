import java.util.Scanner;

public class PercentageCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter obtained score: ");
        double score = scanner.nextDouble();

        System.out.print("Enter total possible score: ");
        double totalScore = scanner.nextDouble();

        if (totalScore == 0) {
            System.out.println("Total score cannot be zero.");
            return;
        }

        double percentage = (score / totalScore) * 100;

        String formattedPercentage = String.format("%.1f", percentage);

        System.out.println("Percentage: " + formattedPercentage + "%");
    }
}
