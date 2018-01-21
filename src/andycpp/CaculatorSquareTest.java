package andycpp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.*;
import org.junit.runner.RunWith;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CaculatorSquareTest {
    private static Calculator calculator = new Calculator();
    private int parameter;
    private int results;
	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}
	@Parameters
	public static Collection Data(){
		return Arrays.asList( new Object[][]{
				{2,4},
				{0,0},
				{-3,9},
		});	
	}
	// 构造函数，对变量进行初始化 
	public CaculatorSquareTest(int parameter ,int results){
		this.parameter = parameter;
		this.results = results;
				
	}
	@Test
	public void testSquare() {
		calculator.square(parameter);
		assertEquals(results,calculator.getResult());
	}

}
