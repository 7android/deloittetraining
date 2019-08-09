package zoo;
import org.animals.*;

public class VandalurZoo {

	public static void main(String[] args) {
		System.out.println("Welcome to Vandlur Zoo!");
		System.out.println("Following are the details of the zoo animals");
		Lion l = new Lion();
			l.isVeg();
			l.canClimb();
			l.getSound();
		Monkey m = new Monkey();
			m.isVeg();
			m.canClimb();
			m.getSound();
		Elephant e = new Elephant();
			e.isVeg();
			e.canClimb();
			e.getSound();

	}

}
