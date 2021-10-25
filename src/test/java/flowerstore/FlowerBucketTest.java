package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerBucket flowerBucket;
    @BeforeEach
    void setUp() {
        flowerBucket = new FlowerBucket();
        FlowerPack flowerPack1 = new FlowerPack(new Flower(FlowerType.ROSE, new int[]{255,0,0}, 100), 7);
        FlowerPack flowerPack2 = new FlowerPack(new Flower(FlowerType.CHAMOMILE, new int[]{255,0,255}, 10), 7);
        flowerBucket.addFlowerPack(flowerPack1);
        flowerBucket.addFlowerPack(flowerPack2);
    }

    @Test
    void addFlowerPack() {
        double price = flowerBucket.getPrice();
        FlowerPack newFlowerPack = new FlowerPack(new Flower(FlowerType.ROSE, new int[]{255,0,0}, 2), 7);
        flowerBucket.addFlowerPack(newFlowerPack);
        assertEquals(price + 14, flowerBucket.getPrice());
    }

    @Test
    void getPrice() {
        assertEquals(770, flowerBucket.getPrice());
    }
}