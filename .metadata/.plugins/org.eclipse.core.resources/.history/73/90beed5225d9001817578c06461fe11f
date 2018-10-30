package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numb = sc.nextDouble();

		if (numb < 0.0 || numb > 100.0) {
			System.out.println("Fora de intervalo");
		} else if (numb <= 25.0) {
			System.out.println("Intervalo (0,25]");
		} else if (numb <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if (numb <= 75.0) {
			System.out.println("Intervalo (50,75]");
		} else {
			System.out.println("Intervalo (75,100]");
		}

		sc.close();
	}

}
