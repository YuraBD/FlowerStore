package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Store store;
    @BeforeEach
    void setUp() {
        FlowerPack flowerPack1 = new FlowerPack();
        FlowerPack flowerPack2 = new FlowerPack();
        int[] color = {127, 0, 0};
        double price = 100;
        for (int i = 0; i < 3; i++) {
            flowerPack1.addFlower(new Flower(FlowerType.ROSE, color, price));
        }
        for (int i = 0; i < 3; i++) {
            flowerPack2.addFlower(new Flower(FlowerType.CHAMOMILE, color, price));
        }
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPack1);
        flowerBucket.addFlowerPack(flowerPack2);

        store = new Store();
        store.addFlowerBucket(flowerBucket);
        System.out.println(store);
        System.out.println(store.search(new Flower(FlowerType.ROSE, color, price)));
    }

    @Test
    void search() {
        assertTrue(store.search(new Flower(FlowerType.ROSE, new int[]{127, 0, 0}, 100)));
        assertFalse(store.search(new Flower(FlowerType.TULIP, new int[]{127, 0, 0}, 100)));
    }
}