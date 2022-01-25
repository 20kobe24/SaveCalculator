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
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
