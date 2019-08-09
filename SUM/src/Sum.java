import java.util.Scanner;

public class Sum {
	
	int a,b,c ;
	Scanner sc = new Scanner(System.in);
	public void sum() {
		System.out.println("Enter the two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a+b;
		if (c>=0)
			System.out.println("The Sum of the two numbers is "+ c);
		else 
			System.out.println("The sum is NEGATIVE");
	}
	public static void main (String [] args){
		System.out.println("Hello and welcome, taking you to sum");
		Sum s = new Sum();
		s.sum();		
	}
}
