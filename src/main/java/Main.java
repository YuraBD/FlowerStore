import conection.Connection;
import delivery.PostDeliveryStrategy;
import flowerstore.Item;
import flowerstore.*;
import order.FastOrderConstructor;
import order.Order;
import payment.CreditCardPaymentStrategy;
import user.Receiver;
import user.Sender;
import user.User;

public class Main {
    public static void main(String[] args) {
       User sd1 = new Sender();
       User sd2 = new Sender();
       System.out.println(sd1.getId());
        System.out.println(sd2.getId());
    }
}