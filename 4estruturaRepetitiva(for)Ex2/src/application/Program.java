package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int in=0;
		int out=0;
		for(int i=1; i<n;i++) {
			int x=sc.nextInt();
			if(x<=20 && x>=10) {
				in +=1;
			}
			else {
				out +=1;
			}
		}
		System.out.println(in+" in");
		System.out.println(out+" out");
				
		
		sc.close();

	}

}
