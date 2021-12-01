package newfeatures;

public class Car1 implements Vehicle {
	
	private String brand;

	public Car1(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "Hiiiii I am Uppppppp!";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "H i i i I am a sloth";
	}

	public static void main(String[] args) {
		
		Car1 obj=new Car1("BMW");
		System.out.println(obj.getBrand());
		System.out.println(obj.speedUp());
		System.out.println(obj.slowDown());
		
		System.out.println(obj.turnAlarmOn());
		System.out.println(obj.turnAlarmOff());
		
		

	}

}
