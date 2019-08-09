package teststring;

class Employee
{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee Finalize Called!!");	
	}
}





public class Demo {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1 = new Employee();
		e1 = null;
		String name = "Lez";
		String name1 = new String();
		name1 = "Tan";
		name = name1;
		String name2 = null;
		System.out.println("Employee object created");
		System.gc();
		
	}

}
