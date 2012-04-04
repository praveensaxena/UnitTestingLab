package common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author psaxena
 */
public class CustomerTest {

    public CustomerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * This method test the requirement that the address cannot be null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void addressShouldNotBeNull() {
        Customer c = new Customer("Praveen", "262-555-4444");
        c.setAddress(null);
    }

    /**
     * This method test the requirement that the address cannot be empty.
     */
    @Test(expected = IllegalArgumentException.class)
    public void addressShouldNotBeEmpty() {
        Customer c = new Customer("Praveen", "262-555-4444");
        c.setAddress("");
    }

    /**
     * All valid test should pass
     */
    @Test
    public void validAddressShouldPass() {
        Customer c = new Customer("Praveen", "262-555-4444");
        c.setAddress("1111 Main Street");
    }
}
