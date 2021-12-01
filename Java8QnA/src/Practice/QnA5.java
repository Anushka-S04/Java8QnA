package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Calculating Maximum, Minimum, Sum, and Average of List elements using stream
public class QnA5 {

	public static void main(String[] args) {
		
		List<Integer> L= new ArrayList<Integer>();
		L.add(23);
		L.add(100);
		L.add(6);
		L.add(4);
		L.add(15);
		
		Optional<Integer> max = L.stream().max((a,b)->a>b?1:-1);
		Optional<Integer> min = L.stream().max((a,b)->Integer.compare(b,a));
		System.out.println("Max value : "+max.get());
		System.out.println("Min value : "+min.get());
		
		Optional<Integer> sum = L.stream().reduce((a,b)->a+b);
		System.out.println("Total Sum : "+sum.get());
		
		long count = L.stream().count();
		System.out.println("Average : "+(sum.get()/count));
		
	}

}
