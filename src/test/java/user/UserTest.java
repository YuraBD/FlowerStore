package user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getId() {
        User receiver = new Receiver();
        User sender = new Sender();
        int currentId = User.id;
        assertEquals(currentId - 2, receiver.getId());
        assertEquals(currentId - 1, sender.getId());
    }
}