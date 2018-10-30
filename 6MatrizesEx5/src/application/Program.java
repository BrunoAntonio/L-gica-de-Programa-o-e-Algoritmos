package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] matA = new int[m][n];
		int[][] matB = new int[m][n];
		int[][] matC = new int[m][n];

		for (int i = 0; i < matA.length; i++) {
			for (int j = 0; j < matA[i].length; j++) {
				matA[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < matB.length; i++) {
			for (int j = 0; j < matB[i].length; j++) {
				matB[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < matC.length; i++) {
			for (int j = 0; j < matC[i].length; j++) {

				matC[i][j] = matA[i][j] + matB[i][j];
				System.out.print(matC[i][j] + " ");
			}
			System.out.println("");

		}

		sc.close();

	}

}
