package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vect08_mediaPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, somaPares = 0, nPares = 0;
		double mediaPares;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();

		}

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				somaPares = somaPares + vect[i];
				nPares++;
			}
		}

		if (nPares == 0) {
			System.out.println("Nenhum número par: ");

		}

		else {
			mediaPares = (double) somaPares / nPares;

			System.out.printf("Media dos pares = %.1f\n", mediaPares);
		}

		sc.close();
	}
}
