package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int item = sc.nextInt();
		int qty = sc.nextInt();

		double price;
		if (item==1) {
			price= 4.00;
		} 
		else if (item==2) {
			price=4.50;
		}
		else if (item==3) {
			price=5.00;
		}
		else if (item==4) {
			price=2.00;
		}
		else if (item==5) {
			price=1.50;
		}
		else {
			price=0;
		}
		
		double total=price*qty;
			
		System.out.printf("Total: R$ %.2f%n",total);

		sc.close();
	}

}
