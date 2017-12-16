package lotto;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Random r = new Random();
		int x = r.nextInt(100) + 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Zgadnij liczbę: ");
		while (scan.hasNextLine()) {
			int number = getNumber(scan);
			if (number < x) {
				System.out.println("Za mało!");
			} else if (number > x) {
				System.out.println("Za dużo!");
			} else if (number == x) {
				System.out.println("Zgadłeś!");
			}
		}
	}

	static int getNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("To nie jest liczba.");
		}
		return scan.nextInt();
	}

	// Zgadnij liczbę: cześć
	// To nie jest liczba.
	// Zgadnij liczbę: 50
	// Za mało!
	// Zgadnij liczbę: 75
	// Za dużo!
	// Zgadnij liczbę: 63
	// Zgadłeś!
}
