package condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		double renda;
		String alicota;
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a sua renda: ");
		renda = sc.nextDouble();

		if (renda <= 1903.98) {
			System.out.printf("\nSua renda de %.2f � isenta de imposto de renda.", renda);
		} else if (renda <= 2826.65) {
			alicota = "7,5%";
			System.out.printf("\nSua renda de %.2f ter� dedu��o de R$ %.2f, correspondente a al�cota de %s.", renda,
					renda * 0.075, alicota);
		} else if (renda < 3751.06) {
			alicota = "15%";
			System.out.printf("\nSua renda de %.2f ter� dedu��o de R$ %.2f, correspondente a al�cota de %s.", renda,
					renda * 0.15, alicota);
		} else if (renda <= 4664.68) {
			alicota = "22,5%";
			System.out.printf("\nSua renda de %.2f ter� dedu��o de R$ %.2f, correspondente a al�cota de %s.", renda,
					renda * 0.225, alicota);
		} else {
			alicota = "27,5%";
			System.out.printf("\nSua renda de %.2f ter� dedu��o de R$ %.2f, correspondente a al�cota de %s.", renda,
					renda * 0.275, alicota);
		}

		sc.close();

	}

}
