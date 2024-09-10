
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditEligibility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double annualIncome;
    private int creditScore;
    private String eligibilityMessage;

    public CreditEligibility() {}

    public CreditEligibility(double annualIncome, int creditScore) {
        this.annualIncome = annualIncome;
        this.creditScore = creditScore;
        this.eligibilityMessage = determineEligibility();
    }

    private String determineEligibility() {
        if (annualIncome >= 30000 && creditScore >= 700) {
            return "Congratulations! You are eligible for a credit score with a high limit.";
        } else if (annualIncome >= 20000 && creditScore >= 600) {
            return "You are eligible for a credit score with a moderate limit.";
        }
        return "You are not eligible for a credit score.";
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public double getAnnualIncome() { return annualIncome; }
    public void setAnnualIncome(double annualIncome) { this.annualIncome = annualIncome; }
    public int getCreditScore() { return creditScore; }
    public void setCreditScore(int creditScore) { this.creditScore = creditScore; }
    public String getEligibilityMessage() { return eligibilityMessage; }
    public void setEligibilityMessage(String eligibilityMessage) { this.eligibilityMessage = eligibilityMessage; }
}
