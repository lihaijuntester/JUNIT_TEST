package andycpp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class CalculatorTest {
	private static Calculator calculator = new Calculator();
	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		calculator.add(1);
		calculator.add(2);
		assertEquals(3,calculator.getResult());
	}
    
	@Test
	public void testSubstract() {
		calculator.add(12);
		calculator.substract(10);
		assertEquals(2,calculator.getResult());
	}
	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		calculator.add(8);
        calculator.divide(2);
        assertEquals(4, calculator.getResult());
	}
	@Test (expected = ArithmeticException.class)//当除数是0的时候应该抛出异常
	public void testDividebyzero(){
		calculator.add(15);
		calculator.divide(0);
	}
	@Test
	public void testsquare(){
		calculator.square(2);
		assertEquals(4,calculator.getResult());
	}
	@Test(timeout = 1000)//表示这个case执行力1秒钟
	public void testsquareRoot(){
		calculator.squareRoot(9);
		assertEquals(3,calculator.getResult());
	}

}
