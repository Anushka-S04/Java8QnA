package newfeatures;
//Method Reference - Shorthand of Lambda Expressions to call method

@FunctionalInterface
interface MyInterface
{
	void MyMethod();
}

class Test //instance class
{
	void display() //instance method
	{
		System.out.println("I am a Instance Method");
	}
}
public class MethodReferenceDemo1 {
	
	public static void main(String[] args) {
		//traditional approach
		Test t1=new Test();
		t1.display();
		
		//Java8 Method Reference Approach
		MyInterface m1ref=t1::display; //method reference to instance method of object
		
		//calling method of FI
		m1ref.MyMethod();
		
		//Lambda ---> FI
		//MR --- Shorthand of Lambda
		//MR ---> FI
		
	}

}
