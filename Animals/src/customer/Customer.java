package customer;

public class Customer {
	
	
	private int customerID;
	private String customerName;
	private String customerAddress;
	private int amount;
	
	

	public Customer() {
		customerID = -1;
		customerName = "NA";
		customerAddress = "Far away";
		amount = 30;
	}


	public Customer(int customerID, String customerName, String customerAddress , int amount) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.amount = amount;
	}

	
	public Customer(int customerID, int amount) {
		this();
		this.customerID = customerID;
		this.amount = amount;
	}

	public Customer(int customerID, String customerName, String customerAddress) {
		this();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	public void disp( ) {
		System.out.println("customerID: "+customerID);
		System.out.println("customerName: "+customerName);
		System.out.println("customerAddressress: "+customerAddress);
		System.out.println("amount: "+amount);
		System.out.println();
	}


	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", amount=" + amount + "]";
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public int getCustomerID() {
		return customerID;
	}
	
	

}
