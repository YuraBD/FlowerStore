package order;

import delivery.PostDeliveryStrategy;
import flowerstore.Flower;
import flowerstore.FlowerPack;
import flowerstore.FlowerType;
import payment.CreditCardPaymentStrategy;

public enum FastOrderConstructor {
    ROSE_PACK (FlowerType.ROSE, new int[]{255,0,0}, 300, 100),
    TULIP_PACK (FlowerType.TULIP, new int[]{0,0,255}, 400, 30),
    CHAMOMILE_PACK(FlowerType.CHAMOMILE, new int[]{}, 100, 50);

    public final FlowerPack flowerPack;
    FastOrderConstructor(FlowerType flowerType, int[] color, int price, int amount) {
        flowerPack = new FlowerPack(new Flower(flowerType, color, price), amount);
    }

    public Order createOrder() {
        Order order = new Order();
        order.addItem(flowerPack);
        order.setPaymentStrategy(new CreditCardPaymentStrategy());
        order.setDeliveryStrategy(new PostDeliveryStrategy());
        return order;
    }
}
