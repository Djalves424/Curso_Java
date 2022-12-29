package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vect05_maiorPosicao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, posicaoMaior;
		double maior;

		System.out.print("Quantos números você vai digitar?");
		n = sc.nextInt();

		double vect[] = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();

		}

		maior = 0;
		posicaoMaior = 0;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posicaoMaior = i;

			}
		}

		System.out.printf("Maior Valor = %.1f\n", maior);
		System.out.printf("Posição do maior valor = %d\n", posicaoMaior);

		sc.close();

	}

}
