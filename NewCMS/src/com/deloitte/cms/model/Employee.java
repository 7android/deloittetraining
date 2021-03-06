package com.deloitte.cms.model;

import java.io.Serializable;

public class Employee implements Serializable {
	
	public String Fname;
	public String LastName;
	public String Empid;
	public String DOB;
	public String Address;
	
	
	
	public Employee() {
		Fname = "NA";
		LastName = "NA";
		Empid = "NA";
		DOB = "NA";
		Address = "NA";

	}

	public Employee(String fname, String lastName, String empid, String dOB, String address) {
	
		Fname = fname;
		LastName = lastName;
		Empid = empid;
		DOB = dOB;
		Address = address;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmpid() {
		return Empid;
	}

	public void setEmpid(String empid) {
		Empid = empid;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + ((DOB == null) ? 0 : DOB.hashCode());
		result = prime * result + ((Empid == null) ? 0 : Empid.hashCode());
		result = prime * result + ((Fname == null) ? 0 : Fname.hashCode());
		result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
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
		Employee other = (Employee) obj;
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (DOB == null) {
			if (other.DOB != null)
				return false;
		} else if (!DOB.equals(other.DOB))
			return false;
		if (Empid == null) {
			if (other.Empid != null)
				return false;
		} else if (!Empid.equals(other.Empid))
			return false;
		if (Fname == null) {
			if (other.Fname != null)
				return false;
		} else if (!Fname.equals(other.Fname))
			return false;
		if (LastName == null) {
			if (other.LastName != null)
				return false;
		} else if (!LastName.equals(other.LastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nEmployee [Fname=" + Fname + ", LastName=" + LastName + ", Empid=" + Empid + ", DOB=" + DOB
				+ ", Address=" + Address + "]";
	}
	
	
	
	
	


}
