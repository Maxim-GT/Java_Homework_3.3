public class CreditPaymentService {
    public double calculate(int sum, int month) {
        double payment = (sum * 0.008325 / (1 - Math.pow(1 + 0.008325, -month)));
        return payment;
    }
}
