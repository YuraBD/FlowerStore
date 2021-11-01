package payment;

public class PayPalPaymentStrategy implements Payment{
    public boolean pay(double price) {
        System.out.println("Paying with PayPal...");
        System.out.printf("Paid %f\n", price);
        return true;
    }
}
