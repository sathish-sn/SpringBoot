package SpringBasic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("quick")

//@Scope("prototype")
public class OuickSort implements SortAlgorithm {
	public int ouickSortAlgo(int[] numbers , int numberToSearch) {
	//	System.out.println("this is quick sort algorithm");
		return 0;
		
	}

	@Override
	public int[] sort(int[] numbers) {
		// TODO Auto-generated method stub
		System.out.println("this is quick sort algorithm");
		return null;
	}

}
