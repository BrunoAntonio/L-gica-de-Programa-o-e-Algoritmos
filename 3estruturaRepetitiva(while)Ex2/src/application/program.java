package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x=sc.nextInt();
		int y=sc.nextInt();
		
		
		/* x=4 y=0   x=true y=false  ||true   while continua
		 * x=4 y=0   x=true y=false  &&false  while para
		 * 
		 */
		
		while(x !=0 && y !=0) {
			
			if (x>0 && y>0) {
				System.out.println("primeiro");
			}
			else if (x<0 && y>0) {
				System.out.println("segundo");
			}
			else if (x<0 && y<0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x=sc.nextInt();
			y=sc.nextInt();
		} 
		
		System.out.println("");
		
		sc.close();
	}

}
