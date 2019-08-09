package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.deloitte.model.*;
import com.deloitte.myappexceptions.InvalidCustomerAddressException;
import com.deloitte.myappexceptions.InvalidCustomerBillAmountException;
import com.deloitte.myappexceptions.InvalidCustomerIdException;
import com.deloitte.myappexceptions.InvalidCustomerNameException;

public class Lists {

	public static void main(String[] args) throws InvalidCustomerBillAmountException, InvalidCustomerIdException, InvalidCustomerNameException, InvalidCustomerAddressException {
		List <Customer> customerList = new ArrayList <Customer>();
		customerList.add(new Customer(1, "Tanvi", "Bangalore", 234));
		customerList.add(new Customer(2, "Leslie", "Mangalore", 435));
		customerList.add(new Customer(3, "Michelle", "Delhi", 764));
		customerList.add(new Customer(4, "Shakir", "Mumbai", 7777));
		customerList.add(new Customer(5, "Jayanth", "Hyderabad", 674));
		customerList.add(new Customer(6, "Sripathi", "Chennai", 856));
		customerList.add(new Customer(7, "Manna", "Delhi", 864));

		
		System.out.println(customerList);
		
		Iterator<Customer> iterator = customerList.iterator();
		while (iterator.hasNext()) {
			Customer cust = iterator.next();
			if(cust.getBillAmount()>700)
				System.out.println(cust);
		}
		
		System.out.println("\n \n");
		
		Iterator<Customer> ite = customerList.iterator();
		while (ite.hasNext()) {
			Customer cust = ite.next();
			if(cust.getCustomerAddress()=="Delhi")
				System.out.println(cust);
		}
		
		System.out.println("\n\n");
		Collections.sort(customerList);
		Iterator<Customer> iter1 = customerList.iterator();
		while (iter1.hasNext()) {
			Customer cust = iter1.next();
				System.out.println(cust);
		}
		
		System.out.println("Please enter sorting option 1.Name 2.BillAmount 3.Address");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		
		if (option ==1)
			Collections.sort(customerList);
		if (option ==2)
			Collections.sort(customerList, new CustomerBillAmountComparator());
		if (option ==3)
			Collections.sort(customerList, new CustomerAddressComparator());
		
		Iterator<Customer> iterator1 = customerList.iterator();
		System.out.println("All Customers : ");
		while (iterator1.hasNext()) {
			Customer cust = iterator1.next();
				System.out.println(cust);
		}
		
	}

}
