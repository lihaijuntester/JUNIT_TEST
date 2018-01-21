package unitest;

public class MyArray {

	/**
	 * @param args
	 */
	
	public int arrayMax(int [] a){
		int i;
		//int max = 0;
		int max =a[0];
		for(i=0;i<a.length;i++){
			if(max < a [i]){
				max = a [i];	
			}
		}
		return max;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
