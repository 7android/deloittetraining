package teststring;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable
{
	private int empId;
	private String empName;
	
	public Emp() {
		super();
	}
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		@Override
		public String toString() {
			return "Emp [empId=" + empId + ", empName=" + empName + "]";
		}
	
	
}

public class Project {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		saveObjectToFile();
		}
	private static void saveObjectToFile() throws FileNotFoundException, IOException {
		Emp emp = new Emp (566, "Tanvi");
		ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("sai.txt"));
		stream.writeObject(emp);
		stream.close();
		System.out.println(emp);
	}

}
