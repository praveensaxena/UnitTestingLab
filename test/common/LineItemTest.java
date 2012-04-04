/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author e1031248
 */
public class LineItemTest {
    
    public LineItemTest() {
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
     * This method test the requirement that the unit cost cannot be null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void unitCostShouldNotBeZero() {
        LineItem litem = new LineItem();
        litem.setUnitCost(0);
    }

    /**
     * This method test the requirement that the unit cost cannot be infinite.
     */
    @Test(expected = IllegalArgumentException.class)
    public void unitCostShouldNotInfinite() {
        LineItem litem = new LineItem();
        litem.setUnitCost(99999999);
    }

    /**
     * All valid test should pass
     */
    @Test
    public void validUnitCostShouldPass() {
        LineItem litem = new LineItem();
        double unitCosts[] = {
          0.1,
          1,
          1234.6666,
          100.99,
          12.0  
        };
        
        for(double cost: unitCosts){
            litem.setUnitCost(cost);
        }
    }
}
