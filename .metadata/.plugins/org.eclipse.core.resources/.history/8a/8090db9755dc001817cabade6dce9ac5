package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int linha = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == mat[linha - 1][j]) {
					
					int temp =mat[i][j];
					mat [i][j]= mat [i][mat[i].length-i];
					mat [i][mat[i].length-i]=temp;
					
				}
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}

		sc.close();

	}

}
