package application;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
				
			if (a>b) {
				if (a%b ==0) {
				System.out.println("MULTIPLE");
				}
				else {
				System.out.println("NOT MULTIPLE");
				}
				
			} else {
				if (b%a==0) {
					System.out.println("MULTIPLE");
				}
				else {
				System.out.println("NOT MULTIPLE");
				}
			}
			
		sc.close();
	}

}
