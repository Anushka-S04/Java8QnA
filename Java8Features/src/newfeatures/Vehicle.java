package newfeatures;

public interface Vehicle {
	
	//by default all are abstract methods even if you dont give that keyword
	String getBrand();
	String speedUp();
	String slowDown();
	
	//Any non-abstract methods must be made default	
	default String turnAlarmOn()
	{
		return "Turning the Vehicle Alarm ON.";
	}
	
	default String turnAlarmOff()
	{
		return "Turning the Vehicle Alarm OFF.";
	}
	
	static int getHorsePower(int rpm,int torque)
	{
		return (rpm*torque)/5252;
	}
	
	

}
