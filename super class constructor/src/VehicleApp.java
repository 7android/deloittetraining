

class vehicle
{
	int modelNumber;
	public vehicle (String carType)
	{
		System.out.println("Vehicle 2nd constructor called"+carType);
	}
}

class Car extends vehicle
{
	public Car()
	{
		super("CG");
		System.out.println("Car def constructor called");
	}
	public Car(String carType)
	{
		super (carType);
		modelNumber = 2009;
	}
}

public class VehicleApp
{
	public static void main (String args[])
	{
		Car c = new Car("Ford");
	}
}
