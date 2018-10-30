package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numb=sc.nextInt();
		
		if(numb<0) {
			System.out.print("NEGATIVE");
		}
		else {
			System.out.print("NOT NEGATIVE");
		}
		
		

		sc.close();
	}

}
