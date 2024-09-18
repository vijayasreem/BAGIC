
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banking")
public class BankingController {

    @GetMapping("/verify")
    public String verifyDocuments(@RequestParam String identityVerified, @RequestParam String addressVerified) {
        if (identityVerified.equalsIgnoreCase("yes") && addressVerified.equalsIgnoreCase("yes")) {
            return "Document verification successful. You are eligible for banking services.";
        } else {
            return "Incomplete document verification. You are not eligible for banking services.";
        }
    }

    @GetMapping("/evaluateCredit")
    public String evaluateCredit(@RequestParam double annualIncome, @RequestParam int creditScore) {
        if (annualIncome >= 30000 && creditScore >= 700) {
            return "Congratulations! You are eligible for a high-limit credit score.";
        } else if (annualIncome >= 20000 && creditScore >= 600) {
            return "You are eligible for a moderate-limit credit score.";
        } else {
            return "You are not eligible for a high-limit or moderate-limit credit score.";
        }
    }
}
