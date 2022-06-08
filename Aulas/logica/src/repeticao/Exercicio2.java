package repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int anoAtual;
			double aumento = 0, salarioInicial = 1000;

			System.out.println("Insira o ano atual: ");
			anoAtual = sc.nextInt();

			for (int anoInicial = 2016; anoInicial <= anoAtual; anoInicial++) {
				System.out.printf("\nInsira o percentual de aumento de %d: ", anoInicial);
				aumento = sc.nextDouble();
				salarioInicial *= (1 + (aumento / 100));
				System.out.printf("O sal�rio atual � de R$%.2f\n.", salarioInicial);
			}
		}

	}

}
