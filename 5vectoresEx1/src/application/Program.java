package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextInt();

		}

		int vectMax = Integer.MIN_VALUE;
		int vectPos = 0;

		for (int i = 0; i < vect.length; i++) {

			if (vectMax < vect[i]) {
				vectMax = vect[i];
				vectPos = i;

			}

		}

		System.out.println(vectMax);
		System.out.println(vectPos);

		sc.close();
	}

}
