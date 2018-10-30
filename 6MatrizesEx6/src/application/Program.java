package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[][] mat = new double[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		int linha = sc.nextInt();
		int coluna = sc.nextInt();

		double sum = 0.0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > 0) {
					sum += mat[i][j];
				}
			}
		}
		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", sum);

		System.out.print("LINHA ESCOLHIDA: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]==mat[linha][j]) {
				System.out.printf("%.1f ", mat[i][j]);
				}
			}
		}
		System.out.println("");

		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]==mat[i][coluna]) {
				System.out.printf("%.1f ", mat[i][j]);
				}
			}
		}
		System.out.println("");

		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == mat[i][i]) {
					System.out.printf("%.1f ", mat[i][j]);
				}
			}
		}
		System.out.println("");

		System.out.println("MATRIZ ALTERADA: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] *= mat[i][j];				
				}
				System.out.printf(" %.1f ", mat[i][j]);
			}
			System.out.println("");
		}

		sc.close();

	}

}
