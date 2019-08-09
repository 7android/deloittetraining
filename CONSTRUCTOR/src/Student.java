
public class Student {
	
	private int id;
	private String name;
	private int fees;
	private float marks;
	
	

	public Student() {
		id = -1;
		name = "NA";
		fees = 10000;
		marks = 30;
	}


	public Student(int id, String name, int fees, float marks) {
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.marks = marks;
	}

	
	public Student(int id, float marks) {
		this();
		this.id = id;
		this.marks = marks;
	}

	public Student(int id, String name, int fees) {
		this();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	
	public void disp( ) {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Fees: "+fees);
		System.out.println("Marks: "+marks);
		System.out.println();
	}


	public static void main(String[] args) {
		
		Student s = new Student();
		s.disp();
		Student s1 = new Student(101, "Ani", 20000, 54);
		s1.disp();
		Student s2 = new Student(203, 78);
		s2.disp();
		Student s3 = new Student(234, "Tanisha", 50000);
		s3.disp();
	 
	}

}
