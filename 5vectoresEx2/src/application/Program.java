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

		int count=0;
		for (int i = 0; i < vect.length; i++) {

			if (vect[i]%2==0) {
				System.out.print(vect[i]+" ");
				count +=1;
			}

		}
		System.out.println("");
		System.out.print(count);


		sc.close();
	}

}
