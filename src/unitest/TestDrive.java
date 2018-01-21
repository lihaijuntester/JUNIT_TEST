package unitest;

public class TestDrive {

	/**
	 * @param args
	 */
	public void testarray(int[] input,int expect){
		MyArray ar = new MyArray();
		int max = ar.arrayMax(input);
		if(max == expect){
			System.out.println("max="+max + "test is pass");
		}
		else{
			System.out.println("max="+max + "test fail");		
		}
	}
	public static void main(String[] args) {
		TestDrive td = new TestDrive();;
		int [] a = {-11,-20,-1,-9,-23,-78,-2};
		td.testarray(a, -1);
		int [] a1 = {60,-20,4,-9,90,-78,-2};
		td.testarray(a1, 90);
		int [] a2 ={88,99,101,3,2,15,45};
		td.testarray(a2, 101);
	}
}
