package condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		int diaSemana;
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um n�mero inteiro de 1 a 7: ");
		diaSemana = sc.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("O n�mero 1 corresponde ao domingo.");
			break;
		case 2:
			System.out.println("O n�mero 2 corresponde a segunda-feira.");
			break;
		case 3:
			System.out.println("O n�mero 3 corresponde a ter�a-feira.");
			break;
		case 4:
			System.out.println("O n�mero 4 corresponde a quarta-feira.");
			break;
		case 5:
			System.out.println("O n�mero 5 corresponde a quinta-feira.");
			break;
		case 6:
			System.out.println("O n�mero 6 corresponde a sexta-feira.");
			break;
		case 7:
			System.out.println("O n�mero 7 corresponde ao s�bado.");
			break;
		default:
			System.out.println("O n�mero informado � inv�lido.");
		}

		sc.close();

	}

}
