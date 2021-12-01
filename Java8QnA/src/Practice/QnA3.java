package Practice;

import java.util.ArrayList;
import java.util.List;

//Given a list of integers, find the total number of elements present in the list using Stream functions?
public class QnA3 {

	public static void main(String[] args) {
		
		List<Integer> L= new ArrayList<Integer>();
		L.add(23);
		L.add(12);
		L.add(6);
		L.add(4);
		L.add(15);

		long soln = L.stream().count();
		System.out.println(soln);
	}

}
