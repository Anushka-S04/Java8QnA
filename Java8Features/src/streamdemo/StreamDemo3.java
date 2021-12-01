package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {

	public static void main(String[] args) {
		
		Integer[] score= {2,5,3,7,8};
		
		Stream<Integer> s=Stream.of(score);
		
		List<Integer> runs=new ArrayList<Integer>();
		runs.add(22);
		runs.add(4);
		runs.add(7);
		runs.add(16);
		
		List<Integer> sq=s.map(x->x*x).filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(sq);
		
		
	}

}
