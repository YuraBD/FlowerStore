package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FastOrderConstructorTest {

    @Test
    void createOrder() {
        Order order1 = FastOrderConstructor.ROSE_PACK.createOrder();
        Order order2 = FastOrderConstructor.TULIP_PACK.createOrder();
        Order order3 = FastOrderConstructor.CHAMOMILE_PACK.createOrder();
        assertEquals(30000, order1.calculateTotalPrice());
        assertEquals(12000, order2.calculateTotalPrice());
        assertEquals(5000, order3.calculateTotalPrice());
    }
}