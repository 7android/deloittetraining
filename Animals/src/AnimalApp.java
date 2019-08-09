
public class AnimalApp {
	
	
	
	public static void main (String args[]) {
		Animals a = new Animals();
		a.eat();
		a.sleep();
		Cat c = new Cat();
		c.eat();
		c.sleep();
		c.sound();
		Cat d = new Cat();
		
		System.out.println(a.equals(c));
		System.out.println(d.equals(c));
	}

}
