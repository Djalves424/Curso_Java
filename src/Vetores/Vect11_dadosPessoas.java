package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vect11_dadosPessoas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, qtdHomens, qtdMulheres;
		double menorAltura, maiorAltura, alturaFemMedia, alturafemTotal;

		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();

		double[] alturas = new double[n];
		char[] generos = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			generos[i] = sc.next().charAt(0);

		}

		menorAltura = alturas[0];
		maiorAltura = alturas[0];

		for (int i = 0; i < n; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];

			}
			
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			
			}
		}

		qtdHomens = 0;
		qtdMulheres = 0;
		alturafemTotal = 0;
		for (int i = 0; i < n; i++) {
			if (generos[i] == 'M') {
				qtdHomens++;

			} 
			else {
				qtdMulheres++;
				alturafemTotal = alturafemTotal + alturas[i];
			}
		}

		alturaFemMedia = alturafemTotal / qtdMulheres;

		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", alturaFemMedia);
		System.out.printf("Número de homens = %d\n", qtdHomens);

		sc.close();

	}
}
