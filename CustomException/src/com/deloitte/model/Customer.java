package com.deloitte.model;

import java.io.Serializable;

import com.deloitte.myappexceptions.InvalidCustomerAddressException;
import com.deloitte.myappexceptions.InvalidCustomerBillAmountException;
import com.deloitte.myappexceptions.InvalidCustomerIdException;
import com.deloitte.myappexceptions.InvalidCustomerNameException;

public class Customer implements Comparable<Customer>{
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;

	public Customer(int customerId, String customerName, String customerAddress, int billAmount) throws InvalidCustomerBillAmountException, InvalidCustomerIdException, InvalidCustomerNameException, InvalidCustomerAddressException {
		super();
		if (customerId > 0)
			this.customerId = customerId;
		else 
			throw new InvalidCustomerIdException("Please enter a valid customer ID");
		
		if(customerName.length() != 0)
			this.customerName = customerName;
		else 
			throw new InvalidCustomerNameException("Please Enter name");
		
		if(customerAddress.length() != 0)
			this.customerAddress = customerAddress;
		else
			throw new InvalidCustomerAddressException("Enter Address");
		
		if (billAmount >0) 
			this.billAmount = billAmount;
		else
			throw new InvalidCustomerBillAmountException("Bill cannot be negative");
	}

	public Customer() {

		this.customerId = 0;
		this.customerName = "NA";
		this.customerAddress = "NA";
		this.billAmount = 0;
	
	}
	
	

	@Override
	public String toString() {
		return "\n Customer  [ customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + "]";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	@Override
	public int compareTo(Customer o) {
		if ((this.getCustomerName()).compareTo(o.getCustomerName()) < 0)
			return -1;
		else
			return 0;
	}
	
	
	
	
	
}
