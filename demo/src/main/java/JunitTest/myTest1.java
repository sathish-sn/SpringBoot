package JunitTest;

public class myTest1 {
	
	public static int sum(int[] num) {
		
		int sum =0;
		for(int x : num) {
			sum = sum +x;		
		}
		System.out.println(sum);
		return sum;
		
	}

}
