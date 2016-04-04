/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retirementcalculator;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tm1c14
 */
public class RetirementModelTest {
    
    public RetirementModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testgetCurrentYear() {
        RetirementModel model = new RetirementModel();
        long expectedYear = 2016;
        Assert.assertEquals(expectedYear, model.getCurrentYear());
    }
    
    @Test
    public void testGetStringValueAsLong() {
         RetirementModel model = new RetirementModel();
         long expectedYear = 2012;
         String input = "2012";
         
         long result = model.getStringValueAsLong(input);
         assertEquals(expectedYear, result);
    }
    
    @Test
    public void testYearsBeforeRetirement() {
        RetirementModel model = new RetirementModel();
        long expectedResult = 25;
        long currentAge = 25;
        long retirementAge = 50;
        model.setRetirementAge(retirementAge);
        model.setUserAge(currentAge);
        
        assertEquals(expectedResult, model.getYearsBeforeRetirement());
    }
    
    @Test
    public void testGetRetirementYear() {
        RetirementModel model = new RetirementModel();
        long expectedResult = 2041;
        long currentAge = 25;
        long retirementAge = 50;
        model.setRetirementAge(retirementAge);
        model.setUserAge(currentAge);
        
        assertEquals(expectedResult, model.getRetirementYear());
    }
    
}
