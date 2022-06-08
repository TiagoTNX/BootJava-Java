package repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double base = 0, altura = 0;

		System.out.println("Insira a base do tri�ngulo: ");
		base = sc.nextDouble();
		System.out.println("Insira a altura do tri�ngulo: ");
		altura = sc.nextDouble();

		if (base <= 0 || altura <= 0) {
			System.out.println("O valor inserido � inv�lido, insira um valor maior que 0.");
		} else {
			System.out.printf("A �rea do tringulo � de %.3f.\n", (base * altura) / 2);
		}

		while (base > 0 && altura > 0) {

			System.out.println("Insira a base do tri�ngulo: ");
			base = sc.nextDouble();
			System.out.println("Insira a altura do tri�ngulo: ");
			altura = sc.nextDouble();

			if (base <= 0 || altura <= 0) {
				System.out.println("\nO valor inserido � inv�lido, insira um valor maior que 0.");
			} else {
				System.out.printf("A �rea do tringulo � de %.3f.\n", (base * altura) / 2);
			}

		}

		sc.close();
	}

}
