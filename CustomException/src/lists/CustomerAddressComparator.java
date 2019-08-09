package lists;

import java.util.Comparator;

import com.deloitte.model.Customer;

public class CustomerAddressComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if ((o1.getCustomerAddress()).compareTo(o2.getCustomerAddress()) < 0)
			return -1;
		else
			return 0;
	}

}
