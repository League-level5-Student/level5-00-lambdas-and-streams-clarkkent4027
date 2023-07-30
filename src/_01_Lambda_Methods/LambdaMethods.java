package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 1; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			StringBuilder build = new StringBuilder(s);
			System.out.println(build.reverse().toString());

		}, "repeat");

		// 3. Call the printCustomMessage method using a lambda so that the String
		// prints with a mix between upper and lower case characters.
		printCustomMessage((h) -> {
			StringBuilder dobby = new StringBuilder(h);
			for (int i = 0; i < h.length(); i += 2) {
				dobby.append(dobby.substring(i, i + 1).toUpperCase().toString());
				dobby.append(dobby.substring(i + 1, i + 2).toString());
			}
			dobby.delete(0, 6);
			System.out.println(dobby.toString());
		}, "repeat");
		// 4. Call the printCustomMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((a) -> {
			StringBuilder goose = new StringBuilder(a);
			String[] sting = a.split("");
			for (int i = 0; i < sting.length; i++) {
				goose.append(sting[i]);
				goose.append(".");
			}
			goose.delete(0, 6);
			System.out.println(goose.toString());
		}, "repeat");
		// 5. Call the printCustomMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((k) -> {
			
			for (int i = 0; i < k.length(); i++) {
		k = k.replaceAll("a", "");
		k = k.replaceAll("e", "");
		k = k.replaceAll("i", "");
		k = k.replaceAll("o", "");
		k = k.replaceAll("u", "");
			}
			StringBuilder ace = new StringBuilder(k);
			System.out.println(ace.toString());
		}, "repeat");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
