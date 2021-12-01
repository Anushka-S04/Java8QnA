package streamdemo;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;



//filter operations on stream
public class StreamExample2 {
	
	public static void main(String[] args) {
	
		List<String> names=Arrays.asList("Jhon","Dan","Mike","Thomson");
		
		//create a stream
		Stream<String> n=names.stream();
		
		//Intermediate Operations
		Stream<String> ln=n.filter(str->str.length() > 3);
		
		ln.forEach(System.out::println);
		
		System.out.println("*************************");
		
		//Pipelining
		//Create a stream --> operations --> convert stream back to collections
		List<String> names1=names.stream().filter(str->str.length() > 4).collect(Collectors.toList());
		System.out.println(names1);
		System.out.println("*************************");
		
		List<Integer> grades=new ArrayList<Integer>();
		grades.add(10);
		grades.add(6);
		grades.add(5);
		grades.add(7);
		grades.add(8);
		grades.add(9);
		
		//build stream from Collections
		
		Stream<Integer> strm1=grades.stream();
		
		//filter only even grades
		List<Integer> gradesEven=strm1.filter(k -> k%2==0).collect(Collectors.toList());
			System.out.println(gradesEven);
	}



}