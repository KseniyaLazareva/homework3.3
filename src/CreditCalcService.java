public class CreditCalcService {

    public int calculate(int creditRub, int termM, double percent) {
        double monthlyIR = (percent / 12 / 100);
        double coefficient = (monthlyIR * Math.pow((1 + monthlyIR), termM) / (Math.pow((1 + monthlyIR), termM)-1));

        int payment = (int)(creditRub * coefficient);
        return payment;
    }
}
