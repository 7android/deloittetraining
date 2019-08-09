package com.hms.deloitte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "hr" , name = "PaymentList")
public class Payment {
	
	@Id
	private int cardNumber;
	@Column
	private String clientName;
	@Column
	private String expiry;
	@Column
	private int cvv;
	@Column
	private String password;
	
	public Payment() {

	}

	public Payment(int cardNumber, String clientName, String expiry, int cvv, String password) {
		super();
		this.cardNumber = cardNumber;
		this.clientName = clientName;
		this.expiry = expiry;
		this.cvv = cvv;
		this.password = password;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cardNumber;
		result = prime * result + ((clientName == null) ? 0 : clientName.hashCode());
		result = prime * result + cvv;
		result = prime * result + ((expiry == null) ? 0 : expiry.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (cardNumber != other.cardNumber)
			return false;
		if (clientName == null) {
			if (other.clientName != null)
				return false;
		} else if (!clientName.equals(other.clientName))
			return false;
		if (cvv != other.cvv)
			return false;
		if (expiry == null) {
			if (other.expiry != null)
				return false;
		} else if (!expiry.equals(other.expiry))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		//return "\nPayment [cardNumber=" + cardNumber + ", clientName=" + clientName + ", expiry=" + expiry + ", cvv="
		//		+ cvv + ", password=" + password + "]";
		return clientName;
	}
	
	
	
	

}
