package payment;

public class CreditCardPaymentStrategy implements Payment {
    public boolean pay(double price) {
        System.out.println("Paying with credit card...");
        System.out.printf("Paid %f", price);
        return true;
    }
}
