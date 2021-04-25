package banking;

import java.io.IOException;

public class Ez {
	public static void print() {
		System.out.println();
	}
	public static void print(String str) {
		System.out.println(str);
	}
	public static void print(double str) {
		System.out.println(str);
	}
	public static void print(Customer customer) {
		System.out.println(customer);
	}
	public static void printf(String str, Object ... args) {
		System.out.printf(str, args);
	}
	public static void print(Exception error) {
		System.out.print(error);
	}
	public static void pause() {
	try {
		printf("Press ENTER to continue\n");
		System.in.read();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		;
	}
	}

}
