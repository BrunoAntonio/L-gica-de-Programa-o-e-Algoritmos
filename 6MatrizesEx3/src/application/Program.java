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
			int max=Integer.MIN_VALUE;
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j]>max)
					max=mat[i][j];
			}
			System.out.println(max);
		}

		sc.close();

	}

}
