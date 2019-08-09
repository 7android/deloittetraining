package teststring;
import java.util.ArrayList;
import java.util.List;

public class Demo5 {
	
	public static void main (String[] args)
	{
		List a = new ArrayList();
		a.add("Marathalli");
		a.add("Fraser Town");
		a.add("Vasanth Nagar");
		a.add("Indira Nagar");
		a.add("Koromangala");
		a.add("Palace Road");
		System.out.println(a);
		a.remove(4);
		System.out.println(a );
	}
	

}
