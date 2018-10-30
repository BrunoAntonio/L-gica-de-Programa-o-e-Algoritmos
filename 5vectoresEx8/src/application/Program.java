package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] genero = new String[n];
		double[] altura = new double[n];
		

		for (int i = 0; i < n; i++) {			
			altura[i] = sc.nextDouble();
			genero[i] = sc.next();
		}

	
		double max=Double.MIN_VALUE;
		double min=Double.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (altura[i]>max) {
				max=altura[i];				
			}
			if(altura[i]<min){
				min=altura[i];
			}
		}
		
		double sum=0.0;
		int Fnum=0;
		int Mnum=0;
		
		for (int i = 0; i < n; i++) {	
			if ("F".equals(genero[i])) {
				sum +=altura[i];
				Fnum +=1;
			}
			if ("M".equals(genero[i])) {
				Mnum +=1;
			}
			
		}
		
		double avg=sum/Fnum;
		
		System.out.printf("Menor altura = %.2f%n",min);
		System.out.printf("Maior altura = %.2f%n",max);
		System.out.printf("Media das alturas das mulheres = %.2f%n",avg);
		System.out.println("Numero de homens = "+Mnum);

		sc.close();
	}

}
