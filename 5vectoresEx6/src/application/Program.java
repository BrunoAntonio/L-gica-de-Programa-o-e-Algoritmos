package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];

		for (int i = 0; i < n; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();

		}

		int max = Integer.MIN_VALUE;
		String name = null;
		for (int i = 0; i < n; i++) {
			if (max < idade[i]) {
				max = idade[i];
				name = nome[i];
			}

		}

		System.out.println("Pessoa mais velha: " + name);

		sc.close();
	}

}
