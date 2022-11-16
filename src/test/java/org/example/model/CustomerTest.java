package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CustomerTest {

    @Test
    void testProperties(){
        Customer customer = new Customer();
        assertNotNull(customer);
        assertNull(customer.getId());
        assertNull(customer.getName());
        assertNull(customer.getName());
        assertNull(customer.getMoney());
    }
}
