package ch.bbw.pr.savecalculator;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Before
    public void setup() {
        SaveCalculator testee = new SaveCalculator();
        testee = new SaveCalculator();
    }

    @After
    public void deleteSetup() {
        int value1 = 2;
        int value2 = 2;
        SaveCalculator testee = new SaveCalculator();
        testee.summe(value1, value2);
    }
   
    @Test
    public void testSummeZweiNegativeIsOk() {
        int value1 = -150;
        int value2 = -200;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -350);
    }

    @Test
    public void testSummeZweiPositiveIsOk() {
        int value1 = 150;
        int value2 = 150;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == 300);
    }
    @Test(expected = ArithmeticException.class)
    public void testSummeGrösstePositiveUndKleinstePositiveMethodenIstOK() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -2147483648);
    }
    
    protected int pow(int value, int powValue) {
        return (int) Math.pow(value, powValue);
    }
     

    // @Test
    // public void shouldAnswerWithTrue()
    // {
    //     assertTrue( true );
    // }
}
