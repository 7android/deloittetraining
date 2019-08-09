package lists;

import java.util.Comparator;

import com.deloitte.model.Customer;

public class CustomerBillAmountComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if (o1.getBillAmount() < o2.getBillAmount())
			return -1;
		else
			return 0;		
	}

}
