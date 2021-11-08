package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import user.Receiver;
import user.Sender;
import user.User;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Order order;
    private User receiver;
    private User sender;
    @BeforeEach
    void setUp() {
        order = FastOrderConstructor.ROSE_PACK.createOrder();
        receiver = new Receiver();
        sender = new Sender();
    }

    @Test
    void addUser() {
        order.addUser(receiver);
        order.addUser(sender);
        assertFalse(order.usersIsEmpty());
    }

    @Test
    void removeUser() {
        order.addUser(receiver);
        order.addUser(sender);
        order.removeUser(receiver);
        order.removeUser(sender);
        assertTrue(order.usersIsEmpty());
    }
}