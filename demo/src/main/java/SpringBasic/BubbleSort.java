package SpringBasic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSort implements SortAlgorithm {
	
	public int bubbleSort(int[] numbers , int numberToSearch) {
		System.out.println("this is BubbleSort algorithm");
		return 0;

}

	@Override
	public int[] sort(int[] numbers) {
		System.out.println("this is BubbleSort algorithm");
		// TODO Auto-generated method stub
		return null;
	}
}