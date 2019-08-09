
public class Doctor {
	
   static int num=0;
	
	public Doctor() {
		num++;
	}
	
	public void disp() {
		System.out.println("The number of objects created is/are " + num);
	}
	
	public static void main (String args[]) {
		Doctor d1 = new Doctor();
		Doctor d2 = new Doctor();
		Doctor d3 = new Doctor();
		Doctor d4 = new Doctor();
		Doctor d5 = new Doctor();
		d1.disp();
	}

}
