package delivery;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    private Delivery delivery;
    private List<Item> items;
    @BeforeEach
    void setUp() {
        items = new ArrayList<>();
        items.add(new Flower(FlowerType.ROSE, new int[]{255,0,0}, 100));
        items.add(new Flower(FlowerType.CHAMOMILE, new int[]{255,0,0}, 100));
        delivery = new DHLDeliveryStrategy();
    }

    @Test
    void deliver() {
        assertTrue(delivery.deliver(items));
    }
}