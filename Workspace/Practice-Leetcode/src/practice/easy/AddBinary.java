package practice.easy;

import java.util.Scanner;

public class AddBinary {

	public static void main(String[] args) {
		String a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc.next();
		System.out.print("Enter b: ");
		b = sc.next();
		while (!a.matches("^[0-1]+$") || !b.matches("^[0-1]+$")) {
			System.out.println("a and b must be binarry numbers");
			System.out.println("Enter a again: ");
			a = sc.next();
			System.out.println("Enter b again: ");
			b = sc.next();
		}
		System.out.println(addBinary(a, b));

	}

	public static String addBinary(String a, String b) {
		StringBuilder res = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0)
				sum += a.charAt(i--) - '0';
			if (j >= 0)
				sum += b.charAt(j--) - '0';

			carry = sum / 2;
			res.append(sum % 2);

		}

		if (carry > 0) {
			res.append(carry);
		}

		return res.reverse().toString();
	}

}
