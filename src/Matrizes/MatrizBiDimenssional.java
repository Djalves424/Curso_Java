package Matrizes;

import java.util.Scanner;

public class MatrizBiDimenssional {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de elementos: ");

		int n = sc.nextInt();
		int mat[][] = new int[n][n];

		System.out.println();
		System.out.println("Digite os valores: ");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.print("Main diagonal = ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		System.out.println();

		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println();
		System.out.println("Negative numbers = " + count);

		sc.close();

	}

}
