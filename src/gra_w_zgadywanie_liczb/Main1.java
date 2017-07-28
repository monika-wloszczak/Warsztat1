package gra_w_zgadywanie_liczb;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
	static void random() {
		
		Random r = new Random();
		int a = r.nextInt((100) + 1);
		System.out.println(a);
		
		Scanner scan = new Scanner(System.in);
		int b = 0;
		while (true) {
			System.out.print("Zgadnij liczbę: ");
			
			try {

				b = scan.nextInt();
				
				

				if (a > b) {
					System.out.println("Za mało!");
					
				} else if (a < b) {
					System.out.println("Za dużo!");
				} else {
					System.out.println("Zgadłeś!");
					break;
				}
				if((a == b-1)||(a == b+1)){
					System.out.println("Jestes blisko");
				}
				//System.out.print("Zgadnij liczbę: ");
				
				

			} catch (InputMismatchException e) {
				System.out.println("To nie jest liczba!");
				scan.next();
	
			}
		}
		scan.close();
	}

	public static void main(String[] args) {

		random();
	}

}
