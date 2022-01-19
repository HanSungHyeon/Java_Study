class Accounting {
    public double valueOfSupply;
    // 부가가치세율
    public static double vatRate = 0.1;
    public Accounting(double ValueOfSupply){
        this.valueOfSupply = ValueOfSupply;
    }

    public double getVAT() {
        return valueOfSupply * vatRate;
    }

    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}

public class AccountingApp {
    public static void main(String[] args) {
        Accounting ac1 = new Accounting(10000);
        Accounting ac2 = new Accounting(20000);

        System.out.println("Value of supply : " + ac1.valueOfSupply);
        System.out.println("Value of supply : " + ac2.valueOfSupply);
        System.out.println("VAT : " + ac1.getVAT());
        System.out.println("VAT : " + ac2.getVAT());
        System.out.println("Total : " + ac1.getTotal());
        System.out.println("Total : " + ac2.getTotal());
    }
}