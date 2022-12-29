package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vect02_soma {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma, media;

		System.out.print("Quantos n�meros voc� vai digitar? ");
		n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um n�mero: ");
			vect[i] = sc.nextDouble();
			

		}

		soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma = soma + vect[i];

		}

		System.out.println("\n");
		media = soma / vect.length;

		System.out.print("Valores = ");

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);

		}

		System.out.printf("\nSoma = %.2f\n", soma);
		System.out.printf("Media = %.2f\n", media);

		sc.close();

	}
}
