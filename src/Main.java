public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        int month = 36;
        double payment = service.calculate(sum, month);

        System.out.println();
        System.out.println("Ежемесячный платеж на 12 месяцев составит:");
        System.out.println(service.calculate(1_000_000, 12));

        System.out.println();
        System.out.println("Ежемесячный платеж на 24 месяца составит:");
        System.out.println(service.calculate(1_000_000, 24));

        System.out.println();
        System.out.println("Ежемесячный платеж на 36 месяцев составит:");
        System.out.println(service.calculate(1_000_000, 36));

    }
}
