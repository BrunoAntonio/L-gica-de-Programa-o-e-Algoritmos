package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double PI = 3.14159;
		int r = sc.nextInt();

		double area = PI * r * r;

		System.out.printf("A=%.4f%n", area);

		sc.close();
	}

}
