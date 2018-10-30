package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int initHour = sc.nextInt();
		int finalHour = sc.nextInt();

		int duration;
		if (initHour < finalHour) {
			duration = finalHour - initHour;
		} else {
			duration = 24 - initHour + finalHour;
		}

		System.out.println("THE MATCH LASTED " + duration + " HOUR(S)");

		sc.close();
	}

}
