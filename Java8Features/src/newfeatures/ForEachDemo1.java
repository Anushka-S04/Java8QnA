package newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Creating Consumer action
public class ForEachDemo1 {
	
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("John","Mike","Alex");
		
		//traversing with consumer interface implementation
		//the whole block of code below is consumer action
		Consumer<String> convertUpperCase=new Consumer<String>()
				{

					@Override
					public void accept(String t) {
					System.out.println(t.toUpperCase());
						
					}
			
				};
		names.forEach(convertUpperCase); //calling instance of consumer
		
		//consumer to display a number
		Consumer<Integer> display= a -> System.out.println(a);
		
		//implement display using accept
		display.accept(10);
	
	//we are creating our own consumer and action without lambda	
	
	}

}
