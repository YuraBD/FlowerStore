package flowerstore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE, new int[]{255,0,0}, 100);
        flower.setSepalLength(14.5);
    }

    @Test
    void setColor() {
        int[] color = {0,255,0};
        flower.setColor(color);
        assertArrayEquals(color, flower.getColor());
    }

    @Test
    void testEquals() {
        Flower flower2 = new Flower(FlowerType.ROSE, new int[]{255,0,0}, 100);
        assertTrue(flower2.equals(flower));
        flower2.setPrice(2);
        assertFalse(flower2.equals(flower));
    }

    @Test
    void getPrice() {
        assertEquals(100, flower.getPrice());
    }

    @Test
    void getSepalLength() {
        assertEquals(14.5, flower.getSepalLength());
    }

    @Test
    void getColor() {
        assertArrayEquals(new int[]{255,0,0}, flower.getColor());
    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }

    @Test
    void setPrice() {
        double price = 15;
        flower.setPrice(price);
        assertEquals(price, flower.getPrice());
    }

    @Test
    void setSepalLength() {
        double sepalLength = 11.1;
        flower.setSepalLength(sepalLength);
        assertEquals(sepalLength, flower.getSepalLength());
    }

    @Test
    void setFlowerType() {
        flower.setFlowerType(FlowerType.TULIP);
        assertEquals(FlowerType.TULIP, flower.getFlowerType());
    }

    @Test
    void testToString() {
        assertEquals("Flower(price=100.0, sepalLength=14.5," +
                " color=[255, 0, 0], flowerType=ROSE)", flower.toString());
    }
}