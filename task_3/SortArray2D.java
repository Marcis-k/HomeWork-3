package task_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArray2D {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("Ievadiet skaitli no 10-20: ");
//		int x = input.nextInt();
//		
//		input.close();

		int x = 5; // testa ievade

		Random rnd = new Random();
		// 5-10

		int ran = 1;
		int[][] arr = new int[x][ran];

		// mix length rows
		for (int i = 0; i < arr.length; i++) {
			ran = rnd.nextInt(50 + 1 - 10) + 10;
			for (int j = 0; j < arr[i].length; j++) {
				arr[i] = new int[ran];
				// System.out.print(arr[i][j] + " ");
			}
			// System.out.println();
		}

		// mix numbers

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				int rara = rnd.nextInt(999 + 1 - 100) + 100;
				arr[i][j] = rara;

				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
		System.out.println();
		System.out.println("Kārtošana");
		System.out.println();

		// augoša secībā
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				Arrays.sort(arr[i]);

				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Vidējās vērtības");
		System.out.println();

		// Vidējā vērtība

		for (int i = 0; i < arr.length; i++) {
			double rowSum = 0;
			for (int j = 0; j < arr[i].length; j++) {

				rowSum += arr[i][j];

			}

			// System.out.print(rowSum+ " ");
			System.out.print("Rinda: " + (i + 1) + " vidējā vērtība: " + rowSum / arr[i].length);
			System.out.println();
		}

		System.out.println();

		// Vidējā vērtība augošā secībā row
		double avg = 0;

		for (int i = 0; i < arr.length; i++) {

			double rowSum = 0;
			for (int j = 0; j < arr[i].length; j++) {

				rowSum += arr[i][j];

			}
			avg = rowSum / arr[i].length;

			System.out.print(avg);

			System.out.println();

		}

	}

}
