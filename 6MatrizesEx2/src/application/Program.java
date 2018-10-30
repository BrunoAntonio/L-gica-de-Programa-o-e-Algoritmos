package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < mat.length; i++) {
			int soma = 0;
			for (int j = 0; j < mat[i].length; j++) {
				soma += mat[i][j];
			}
			System.out.println(soma);
		}

		sc.close();

	}

}
