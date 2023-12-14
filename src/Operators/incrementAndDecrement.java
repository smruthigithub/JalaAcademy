package Operators;

public class incrementAndDecrement {
	
	int i = 90;

	public static void main(String[] args) {

		incrementAndDecrement id = new incrementAndDecrement();
		id.increment();
		id.decrement();

	}

	void increment() {

		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i);

	}
	
	void decrement() {

		System.out.println(i--);
		System.out.println(i);
		System.out.println(--i);
		System.out.println(i);

	}

}
