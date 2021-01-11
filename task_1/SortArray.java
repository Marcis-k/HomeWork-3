package task_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Ievadiet masīva izmēru robežās no 20 līdz 40: ");
		int x = input.nextInt();

		int[] sizeArrays = new int[x];

		Random rnd = new Random();
		
		input.close();

		for (int i = 0; i < sizeArrays.length; i++) {
			for (int j = 10; j <= 99; j++) {

				sizeArrays[i] = rnd.nextInt(j);

			}

			System.out.print(sizeArrays[i] + ", ");

		}
		System.out.println();

		Arrays.sort(sizeArrays);
		System.out.print(Arrays.toString(sizeArrays));

	}

}
