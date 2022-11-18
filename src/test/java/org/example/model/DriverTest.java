package org.example.model;

import org.example.domain.model.Driver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class DriverTest {

    @Test
    void testProperties(){
        Driver user = new Driver();
        assertNotNull(user);
        assertNull(user.id);
        assertNull(user.name);
        assertNull(user.lastName);
    }


}
