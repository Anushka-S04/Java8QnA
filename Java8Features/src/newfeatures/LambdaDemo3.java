package newfeatures;

//block lambda expressions
public class LambdaDemo3 {

	public static void main(String[] args) {
		
		MyString reverseStr= (str) -> {
			String result="";
			for(int i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		};
		
		System.out.println(reverseStr.MyStringFunction("Lambda Expressions"));
		
	
	//lambda expression with single parameter
	MyString myName = (name) -> { return "Hello "+name;};
	
	System.out.println(myName.MyStringFunction("Raj"));
 
	//lambda expression with single parameter with no paranthesis
		MyString myName1 = name -> { return "Hello "+name;};
		
		System.out.println(myName1.MyStringFunction("James Gosling"));
	}
}
