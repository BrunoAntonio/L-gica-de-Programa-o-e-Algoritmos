package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		
		for (int i = 1; i <= n; i++) {
			
				System.out.println(i+" "+i*i+" "+i*i*i);
			}

		
		

		sc.close();

	}

}
