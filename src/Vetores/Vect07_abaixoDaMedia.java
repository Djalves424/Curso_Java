package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vect07_abaixoDaMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma, media;

		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();

		}

		soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma = soma + vect[i];

		}

		media = soma / n;

		System.out.printf("\nMedia do vetor = %.3f\n", media);
		System.out.printf("Elementos abaixo da media: ");
		System.out.println(" \n ");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.printf("%.1f\n", vect[i]);
				
			}
		}

		sc.close();

	}
}
