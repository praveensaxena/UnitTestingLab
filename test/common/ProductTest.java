
package common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author e1031248
 */
public class ProductTest {
    
    public ProductTest() {
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
     * This method test the requirement that the product id cannot be null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void productIDShouldNotBeNull() {
        Product p = new Product();
        p.setProdId(null);
        
    }

    /**
     * This method test the requirement that the product id cannot be empty.
     */
    @Test(expected = IllegalArgumentException.class)
    public void productIDShouldNotBeEmpty() {
        Product p = new Product();
        p.setProdId("");
    }

    /**
     * All valid test should pass
     */
    @Test
    public void validProductIDShouldPass() {
        Product p = new Product();
        
        String validProds[] = {
            "1234",
            "1",
            "a",
            "A",
            "sad23124jndfo082347u32047"};
        
        for(String pid: validProds){
            p.setProdId(pid);
        }
    }
}
