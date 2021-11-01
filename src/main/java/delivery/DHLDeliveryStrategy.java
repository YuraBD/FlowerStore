package delivery;

import flowerstore.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    public boolean deliver(List<Item> items) {
        System.out.println("Your items will be delivered by DHL Delivery");
        return true;
    }
}
