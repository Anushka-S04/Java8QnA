package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Given a list of integers, sort all the values present in it using Stream functions?
public class QnA4 {

	public static void main(String[] args) {
		
		List<Integer> L= new ArrayList<Integer>();
		L.add(23);
		L.add(12);
		L.add(6);
		L.add(4);
		L.add(15);
		
		Stream<Integer> sort = L.stream().sorted();
		sort.forEach(System.out::println);

	}

}
