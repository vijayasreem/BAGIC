
import java.util.Scanner;

public class CreditEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter annual income: ");
            double annualIncome = scanner.nextDouble();
            System.out.print("Enter credit score: ");
            int creditScore = scanner.nextInt();

            if (annualIncome >= 30000 && creditScore >= 700) {
                System.out.println("Congratulations! You are eligible for a credit score with a high limit.");
            } else if (annualIncome >= 20000 && creditScore >= 600) {
                System.out.println("You are eligible for a credit score with a moderate limit.");
            }
        } finally {
            scanner.close();
        }
    }
}
