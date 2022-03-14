package two;

public class Fibonacci {

	public static void main(String[] args) {
		long a = 0, b = 1, c;
		System.out.println(a);
		System.out.println(b);
		for (int i = 3; i <= 100; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c);
			System.out.println("\t"+i);
		}
	}

}
