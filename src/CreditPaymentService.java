public class CreditPaymentService {
    public double calculate(int sum, int month, double percent) {
        double interestRate = percent / (100*12);
        double payment = (sum * interestRate / (1 - Math.pow(1 + interestRate, -month)));
        return payment;
    }
}
