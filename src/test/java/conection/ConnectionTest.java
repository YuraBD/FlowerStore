package conection;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {

    @Test
    void getConnection() {
        assertNull(Connection.thisConnection);
        Connection cn1 = Connection.getConnection();
        Connection cn2 = Connection.getConnection();
        assertSame(cn1, cn2);
    }
}