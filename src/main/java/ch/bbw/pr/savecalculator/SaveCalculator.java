package ch.bbw.pr.savecalculator;

/**
 * SaveCalculator
 * Rechnet 'vorsichtig' mit Zahlen.
 * Warnt, wenn etwas nicht geht.
 * 
 * @author Ryan Carpio
 * @version 0.0.1
 */
public class SaveCalculator {
	public int summe(int summand1, int summand2) throws ArithmeticException {
		long value = (long) summand1 + (long) summand2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}

	// Noch un-safe Methoden, die müssen noch angepasst werden.
	public int subtract(int subtract1, int subtract2) throws ArithmeticException {
		long value = (long) subtract1 - (long) subtract2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();

		}
		return subtract1 - subtract2;
	}

	public int subtraktion(int value1, int value2) {
		long value = (long) value1 - (long) value2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return value1 - value2;
	}

	public double divide(int value1, int value2) {
		if (value2 == 0)
			throw new ArithmeticException("division on zero");
		long value = (long) value1 / (long) value2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return value1 / value2;
	}

	public double multiply(Integer value1, Integer value2) {
		long value = (long) value1 * (long) value2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return value1 * value2;
	}

	// math.pow is applied 
	protected int pow(int value, int powValue) {
		return (int) Math.pow(value, powValue);
	}

	// calculating SQRT
	public int sqrt(int value) {
		if (value == 0)
			return 0;
		if (value < 0)
			throw new ArithmeticException();
		return (int) Math.sqrt(value);
	}

	// calculate rest with modulo
	public int modulo(int a, int b) {
		return a % b;
	}
	//Zusatzaufgabe

	public String decToBinary(int decNumber) {
		return Integer.toBinaryString(decNumber);
	}

	public String decToHex(int decNumber) {
		return Integer.toHexString(decNumber).toUpperCase();
	}

	public String decToOctal(int decNumber) {
		return Integer.toOctalString(decNumber).toUpperCase();
	}
}