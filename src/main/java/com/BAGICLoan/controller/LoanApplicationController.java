@GetMapping("/byApplicantName/{applicantName}")
public List<LoanApplication> getLoanApplicationsByApplicantName(@PathVariable String applicantName) {
    return loanApplicationService.getLoanApplicationsByApplicantName(applicantName);
}
