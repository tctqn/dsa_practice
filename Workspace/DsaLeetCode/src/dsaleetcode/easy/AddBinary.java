package dsaleetcode.easy;

import java.util.Scanner;

public class AddBinary {
	public static void main(String[] args) {
		String a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc.nextLine();
		System.out.print("Enter b: ");
		b = sc.nextLine();
		while (!a.matches("^[0-1]+$") || !b.matches("^[0-1]+$")) {
			System.out.println("a and b must be binary number");
			System.out.print("Enter a: ");
			a = sc.nextLine();
			System.out.print("Enter b: ");
			b = sc.nextLine();
		}
		sc.close();
		StringBuilder sb = new StringBuilder();

// Approach: Use 2 pointer to iterate backward and get sum after all reverse the string.

		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0)
				sum += a.charAt(i--) - '0'; // Subtract by '0' to convert value from char type to int
			if (j >= 0)
				sum += b.charAt(j--) - '0';
			carry = sum > 1 ? 1 : 0;
			sb.append(sum % 2);
		}
		if (carry != 0)
			sb.append(carry);
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
}
