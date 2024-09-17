
import java.util.Scanner;

public class BankingService {

    public static void main(String[] args) {
        openDocumentVerificationApp();
    }

    private static void openDocumentVerificationApp() {
        System.out.println("Welcome to the Document Verification App");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter identity verification (yes/no): ");
        String identityVerified = scanner.nextLine();

        System.out.print("Enter address verification (yes/no): ");
        String addressVerified = scanner.nextLine();

        if (identityVerified.equalsIgnoreCase("yes") && addressVerified.equalsIgnoreCase("yes")) {
            System.out.println("Document verification successful. You are eligible for banking services.");
            validateCreditEvaluation(scanner);
        } else {
            System.out.println("Incomplete document verification. You are not eligible for banking services.");
        }

        scanner.close();
    }

    private static void validateCreditEvaluation(Scanner scanner) {
        System.out.print("Enter annual income: ");
        double annualIncome = scanner.nextDouble();

        System.out.print("Enter credit score: ");
        int creditScore = scanner.nextInt();

        if (annualIncome >= 30000 && creditScore >= 700) {
            System.out.println("Congratulations! You are eligible for a high-limit credit score.");
        } else if (annualIncome >= 20000 && creditScore >= 600) {
            System.out.println("You are eligible for a moderate-limit credit score.");
        } else {
            System.out.println("You are not eligible for a high-limit or moderate-limit credit score.");
        }
    }
}
