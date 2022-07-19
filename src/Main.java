public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        int month = 36;
        double percent = 9.99;
        double interestRate = percent / (100*12);
        double payment = service.calculate(sum,month,percent);

        System.out.println();
        System.out.println("Ежемесячный платеж на 12 месяцев составит:");
        System.out.println(service.calculate(1_000_000, 12,9.99));

        System.out.println();
        System.out.println("Ежемесячный платеж на 24 месяца составит:");
        System.out.println(service.calculate(1_000_000, 24, 9.99));

        System.out.println();
        System.out.println("Ежемесячный платеж на 36 месяцев составит:");
        System.out.println(service.calculate(1_000_000, 36, 9.99));

    }
}
