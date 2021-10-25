package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack;
    @BeforeEach
    void setUp() {
        flowerPack = new FlowerPack(new Flower(FlowerType.ROSE, new int[]{255,0,0}, 100), 10);
    }

    @Test
    void addFlower() {
        flowerPack.addFlower(new Flower(FlowerType.ROSE, new int[]{255,0,0}, 100));
        assertEquals(11, flowerPack.getAmount());
        flowerPack.addFlower(new Flower(FlowerType.CHAMOMILE, new int[]{255,0,0}, 100));
        assertEquals(11, flowerPack.getAmount());
    }

    @Test
    void getFlower() {
        assertEquals(new Flower(FlowerType.ROSE, new int[]{255,0,0}, 100), flowerPack.getFlower());
    }

    @Test
    void getPrice() {
        assertEquals(1000, flowerPack.getPrice());
    }

    @Test
    void getAmount() {
        assertEquals(10, flowerPack.getAmount());
    }
}