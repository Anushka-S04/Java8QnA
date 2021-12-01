package newfeatures;

import java.time.LocalDate;

//Java8 allows to add functionality to Interfaces
interface Parser{
	default void parse() {
		System.out.println("Default Parsing logic");
	}
	
	static void displayDate()
	{
		System.out.println(LocalDate.now());
	}
}

class TextParser implements Parser
{
	void display() {
		System.out.println("Hello Text Parser");
	}
	//inherit default implementation of parse
}

class XMLParser implements Parser
{
	//overriden method
	public void parse() {
		System.out.println("Parsing XML Files");
	}
}

public class DefaultMethodDemo2 {

	public static void main(String[] args) {
		
		Parser p=new TextParser(); //Up Casting
		p.parse();//invoke default method in interface
		
		TextParser p1=new TextParser();//references child class TextParser
		p1.display();
		
		p=new XMLParser();//references child class XMLParser
		p.parse();// invokes overridden method
		
		System.out.println("Program executed at :");
		Parser.displayDate();//invoke static method

	}

}
