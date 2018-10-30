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

		double sum=0.0;
		int numb=0;
		for (int i = 0; i < vect.length; i++) {
			if(vect[i]%2==0) {
			sum += vect[i];	
			numb +=1;
			}
		}
		
		double avg=sum/numb;	
		System.out.printf("%.1f%n",avg);

		sc.close();
	}

}
