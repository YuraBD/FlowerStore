package order;

import delivery.Delivery;
import flowerstore.Item;
import payment.Payment;
import user.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {
    private LinkedList<Item> items = new LinkedList<>();
    private Payment payment;
    private Delivery delivery;
    private List<User> users = new ArrayList<>();

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        if (items == null) {
            return 0;
        }
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void processOrder() {
        if (payment == null) {
            System.out.println("Please set payment strategy");
            return;
        }
        if (delivery == null) {
            System.out.println("Please set delivery strategy");
            return;
        }
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
    }

    void addUser(User user) {
        users.add(user);
    }

    void removeUser(User user) {
        users.remove(user);
    }

    void notifyUsers() {
        for (User user : users) {
            user.update(true);
        }
    }

    void order() {
        notifyUsers();
    }

    boolean usersIsEmpty() {
        return users.size() == 0;
    }

}
