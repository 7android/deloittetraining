package customer;

public class CustApp {
	
public static void main(String[] args) {
		
		Customer customer1 = new Customer(111, "Leslie", "Mangalore", 99);
		Customer customer2 = new Customer(101, "Ani", "Bangalore", 54);		
		Customer customer3 = new Customer(203, "Michelle", "Kochi");
		Customer customer4 = new Customer(234, "Tanisha", "Ethiopia");
		
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
		System.out.println(customer4);
		
		customer3.setAmount(87);
		System.out.println(customer3);
	 
	}

}
