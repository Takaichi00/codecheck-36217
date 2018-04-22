package codecheck;

public class App {

	public static String output(String input) {
		return "Hello " + input + "!";
	}

	public static void main(String[] args) {
		System.out.println(output(args[0]));
	}
}
