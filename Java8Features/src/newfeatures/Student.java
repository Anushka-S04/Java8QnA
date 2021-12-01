package newfeatures;

public class Student {
	
	Integer rollNumber;
	String name;
	Double marks;//D caps so that collections can take it as rapper class
	//right click--source--generate constructor using fields--generate
	
	public Student(int rollNumber, String name, double marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public Double getMarks() {
		return marks;
	}


}
