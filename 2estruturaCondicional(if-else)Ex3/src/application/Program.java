package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		/*  if (a>b) {
		 * 
		 *  }
		 *  else if {
		 *  
		 * }
		 *                         ou
		 *  equivale a if(a%b == 0 || b%a==0)
		 *  
		 */
		
			if (a%b == 0 || b%a==0) {
				System.out.print("MULTIPLE");
			} else {
				System.out.print("NOT MULTIPLE");
			}

		
		sc.close();
	}

}
