public class Main {
    public static void main(String[] args) {
        CreditCalcService service = new CreditCalcService();

        System.out.println(service.calculate(1000000, 12, 9.99));

        System.out.println(service.calculate(1000000, 24, 9.99));

        System.out.println(service.calculate(1000000, 36, 9.99));









    }
}