package com.hms.deloitte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "hr", name = "transaction")
public class Transaction {
	
	@Id
	private String trnum;
	@Column
	private String feedback;
	@Column
	private int cardNumber;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(String trnum, String feedback, int cardNumber) {
		super();
		this.trnum = trnum;
		this.feedback = feedback;
		this.cardNumber = cardNumber;
	}

	public String getTrnum() {
		return trnum;
	}

	public void setTrnum(String trnum) {
		this.trnum = trnum;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cardNumber;
		result = prime * result + ((feedback == null) ? 0 : feedback.hashCode());
		result = prime * result + ((trnum == null) ? 0 : trnum.hashCode());
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
		Transaction other = (Transaction) obj;
		if (cardNumber != other.cardNumber)
			return false;
		if (feedback == null) {
			if (other.feedback != null)
				return false;
		} else if (!feedback.equals(other.feedback))
			return false;
		if (trnum == null) {
			if (other.trnum != null)
				return false;
		} else if (!trnum.equals(other.trnum))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nTransaction [trnum=" + trnum + ", feedback=" + feedback + ", cardNumber=" + cardNumber + "]";
	}
	 
	

}
