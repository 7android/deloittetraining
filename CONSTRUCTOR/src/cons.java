
public class cons {
	
	public cons() {
		int i = 200;
		System.out.println(i);
	}

	public cons (int a) {
		int i = a;
		System.out.println(++i);
	}
	
	public static void main(String[] args) {
		new cons();
		new cons(14);

	}

}
