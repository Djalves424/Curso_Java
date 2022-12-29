package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vect04_NumPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, qtdPares;

		System.out.print("Quantos n�meros voc� vai digitar? ");
		n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um n�mero: ");
			vect[i] = sc.nextInt();

		}

		System.out.println("\nN�meros pares:");

		qtdPares = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				qtdPares++;

			}

		}

		System.out.printf("\n\nQuantidade de n�meros pares %d\n", qtdPares);

		sc.close();
	}

}
