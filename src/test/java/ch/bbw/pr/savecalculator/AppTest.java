package ch.bbw.pr.savecalculator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import static org.junit.Assert.assertEquals;
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

    
    @Test
    public void testsummezweiPositiveMethodenIstOK() {
        int value1 = 25;
        int value2 = 25;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == 50);
    }

    @Test
    public void testsummezweiNegativeMethodenIstOK() {
        int value1 = -46;
        int value2 = -20;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -66);
    }

    @Test(expected = ArithmeticException.class)
    public void TestSummeGroesstePositiveundKleinstePositiveMethodenIstOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -2147483648);
    }

    @Test
    public void testsummezweinegativezahlenIsOk() {
        int value1 = -150;
        int value2 = -200;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -350);
    }

    @Test
    public void testsummeZweiPositiveZahlenIsOk() {
        int value1 = 420;
        int value2 = 69;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == 489);
    }

    @Test
    public void SummetestpositivenegativezahlenistOK() {
        int value1 = 5;
        int value2 = -10;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -5);
    }

    @Test(expected = ArithmeticException.class)
    public void SummetestgrosstepositiveundKleinstepositiveZahlThrowsexpectedExpetionOK() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        testee.summe(value1, value2);
    }

    @Test
    public void SummegreosstnegativeundkleinstpositiveIstOK() {
        int value1 = Integer.MIN_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.summe(value1, value2) == -2147483647);
    }

    @Test
    public void testSubtraktionVonzweiositiveZahlenIstOk() {
        int value1 = 20;
        int value2 = 40;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.subtract(value1, value2) == -20);
    }

    @Test
    public void testSubtraktionVonzweinegativeZahlenIstOk() {
        int value1 = -80;
        int value2 = -110;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.subtract(value1, value2) == 30);
    }

    @Test
    public void SubtraktionvonNegativeundPositiveisOk() {
        int value1 = 2024;
        int value2 = -2026;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.subtract(value1, value2) == 4050);
    }

    @Test
    public void SubtraktiongroesstenegativeundkleinstenegativeIsOk() {
        int value1 = Integer.MIN_VALUE;
        int value2 = -1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.subtract(value1, value2) == -2147483647);
    }

    @Test(expected = ArithmeticException.class)
    public void SubtraktiongroesstePositiveundKleinsteNegativezahlThrowsExpectedExpectionIstOK() {
        int value1 = Integer.MAX_VALUE;
        int value2 = -1;
        SaveCalculator testee = new SaveCalculator();
        testee.subtract(value1, value2);
    }

    @Test
    public void SubtraktionPositiveUndNullMethodenIsOk() {
        int value1 = 8;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.subtract(value1, value2) == 8);
    }

    @Test
    public void SubtraktionNegataiveUndNullMethodenIsOk() {
        int value1 = -3;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.subtract(value1, value2) == -3);
    }

    @Test
    public void SubtratktiongroesstepositiveUndkleinstePositiveZahlIsOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.subtract(value1, value2) == 2147483646);
        testee.subtract(value1, value2);
    }

    @Test
    public void DivisionzweiPositiveZahlenIsOK() {
        int value1 = 35;
        int value2 = 7;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.divide(value1, value2) == 5);
    }

    @Test
    public void DivisionzweiNegativeZahlenIsOK() {
        int value1 = -100;
        int value2 = -25;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.divide(value1, value2) == 4);
    }

    @Test
    public void DivisionPositivundnegativeZahlIsOk() {
        int value1 = 200;
        int value2 = -4;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.divide(value1, value2) == -50);
    }

    @Test(expected = ArithmeticException.class)
    public void DivisionpositivezahlUndnullthrowsexpectedexceptionistok() {
        int value1 = 19;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        testee.divide(value1, value2);
    }

    @Test(expected = ArithmeticException.class)
    public void Divisionnegativezahlnndnullthrowsexpectedexceptionistok() {
        int value1 = -9;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        testee.divide(value1, value2);
    }

    @Test
    public void Divisiongrosstositivezahlkleinstepositivethrowsexpectedexceptionisok() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.divide(value1, value2) == 2147483647);
    }

    @Test
    public void Divisiongrosstenegativekleinstepositiveisok() {
        int value1 = Integer.MIN_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.divide(value1, value2) == -2147483648);
    }

    @Test
    public void Divisiongrosstepositivezahlkleinstenegativeisok() {
        int value1 = Integer.MAX_VALUE;
        int value2 = -1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.divide(value1, value2) == -2147483647);
    }

    @Test
    public void Multiplikationvonpositivezahlenmitprotectedmethodeisok() {
        int value1 = 10;
        int value2 = 10;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == 100);
    }

    @Test
    public void MultiplikationpostivezahlnegativezahlisOk() {
        int value1 = 50;
        int value2 = -2;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == -100);
    }

    @Test
    public void Multiplikationvonnegativezahlisok() {
        int value1 = -12;
        int value2 = -12;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == 144);
    }

    @Test
    public void Multiplikationpositivezahlnndnullisok() {
        int value1 = 7;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == 0);
    }

    @Test
    public void Multiplikationnegativezahlnndnullisok() {
        int value1 = -5;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == 0);
    }

    @Test
    public void Multiplikationgrosstepositivezahlundkleinstenegativezahlistok() {
        int value1 = Integer.MAX_VALUE;
        int value2 = -1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == -Integer.MAX_VALUE);
    }

    @Test
    public void Multiplikationgrösstepositiveundkleinstepositiveistok() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == 2147483647);
    }

    @Test
    public void Multiplikationgrösstenegativekleinstepositiveistok() {
        int value1 = Integer.MIN_VALUE;
        int value2 = 1;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == -2147483648);
    }
    
    @Test
    public void MultiplikationNegativezahlnndnullisok() {
        int value1 = -11;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == 0);
    }
    
    @Test
    public void MultiplikationPositivezahlnndnullisok() {
        int value1 = 14;
        int value2 = 0;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == 0);
    }
    
    @Test
    public void MultiplikationPostivezahlnegativezahlisOk() {
        int value1 = 200;
        int value2 = -5;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == -1000);
    }

    @Test
    public void MultiplikationVonnegativezahlisok() {
        int value1 = -25;
        int value2 = -4;
        SaveCalculator testee = new SaveCalculator();
        assertTrue(testee.multiply(value1, value2) == 100);
    }
    
    
     

    // @Test
    // public void shouldAnswerWithTrue()
    // {
    //     assertTrue( true );
    // }
}
