package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    private Item item;
    @BeforeEach
    void setUp() {
        item = new Flower(FlowerType.ROSE, new int[]{255,0,0}, 100);
        item = new RibbonDecorator(item);
    }

    @Test
    void getPrice() {
        assertEquals(140, item.getPrice());
        item = new RibbonDecorator(item);
        assertEquals(180, item.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("Flower{price=100.0, sepalLength=0.0, color=[255, 0, 0]," +
                " flowerType=ROSE} | Ribbon{price:40}", item.getDescription());
    }
}