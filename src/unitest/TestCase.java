package unitest;

public class TestCase {

	/**
	 * 测试数组里面全是正数时
	 */
	public void testarrayispositive(){
		MyArray ma = new MyArray();
		int [] a ={88,99,101,3,2,15,45};
		int expect = 101;
		int max= ma.arrayMax(a);
		if(expect == max ){
			System.out.println("max="+max + "test pass");
		}
		else{
			System.out.println("max="+max + "test fail");
		}		
	}
	public void testarryisnegtive(){
		MyArray mc = new MyArray();
		int [] a = {-11,-20,-1,-9,-23,-78,-2};
		int expect = -1;
		int max = mc.arrayMax(a);
		if(expect == max ){
			System.out.println("max="+max +"test pass");
		}
		else{
			System.out.println("max="+max + "test fail");
		}		
	}
	public void testarrymix(){
		MyArray mc = new MyArray();
		int [] a = {60,-20,4,-9,90,-78,-2};
		int expect = 90;
		int max = mc.arrayMax(a);
		if(expect == max ){
			System.out.println("max="+max + "test pass");
		}
		else{
			System.out.println("max="+max + "test fail");
		}		
	}
	public static void main(String[] args) {
		TestCase tc = new TestCase();
		tc.testarrayispositive();
		tc.testarryisnegtive();
		tc.testarrymix();
	}

}
