package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
public class QnA2 {

	public static void main(String[] args) {
		List<Integer> L= new ArrayList<Integer>();
		L.add(23);
		L.add(12);
		L.add(6);
		L.add(4);
		L.add(115);
		
		
		Stream<Integer> soln = L.stream().filter(x->(x.toString().charAt(0) == '1'));
		soln.forEach(System.out::println);

	}

}
