package task_2;

import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String[] args) {

		int x = getInputInRange("Ievadiet cik pirmsskaitļus vēlaties uzģenerēt (0-100):", 0, 100);

		String result = "";

		int primeNumStart = 1; // sākot no 1

		while (x != 0) {
			boolean isPrime = true;
			for (int i = 2; i <= (primeNumStart / 2); i++) {
				if (primeNumStart % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				if (x > 1) {
					result += primeNumStart + ", ";
					x--;
				} else {
					result += primeNumStart;
					x--;
				}
			}
			primeNumStart++;

		}
		System.out.println("Pirmskaitļi: " + result);

	}

	private static int getInputInRange(String string, int i, int j) {
		int inputN = -1;
		Scanner input = new Scanner(System.in);
		while (inputN < i || inputN > j) {
			System.out.print("Ievadiet cik pirmsskaitļus vēlaties uzģenerēt (0-100):");
			inputN = input.nextInt();
		}
		input.close();
		return inputN;
	}

}
