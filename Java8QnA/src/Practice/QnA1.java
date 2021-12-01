package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Given a list of integers, find out all the even numbers exist in the list using Stream functions?
public class QnA1 {

	public static void main(String[] args) {
		
		List<Integer> L= new ArrayList<Integer>();
		L.add(23);
		L.add(12);
		L.add(6);
		L.add(4);
		L.add(35);
		
		Stream<Integer> even=L.stream().filter(a->a%2==0);
		//System.out.println(even);
		even.forEach(System.out::println);

	}

}
