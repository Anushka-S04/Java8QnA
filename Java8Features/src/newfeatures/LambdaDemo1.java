package newfeatures;

//creating a functional interface
@FunctionalInterface
interface MyFI
{
	public String sayHello(); //abstract method by default
    //public String sayHello1();
}

@FunctionalInterface
interface FIhehe
{
	public int add(int a,int b);
}

public class LambdaDemo1 {

	public static void main(String[] args) {
		
		//creating instance of MyFI
		MyFI msg= () -> { return "Hello World";}; //lambda expression
		
		System.out.println(msg.sayHello());
		
		//Lambda expression can't be used without functional interface
		
		FIhehe obj= (a,b) -> {return (a+b);};
		System.out.println(obj.add(3, 7));
		
	}

}
