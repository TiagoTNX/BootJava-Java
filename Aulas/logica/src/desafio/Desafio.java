package desafio;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double preco, precoImposto, precoLucro, totalC = 0, totalE = 0, totalV = 0;
		int quantidade, produto = 1;
		char categoria;

		while (produto <= 15) {

			System.out.printf("\nInsira a categoria do produto %d (C, E ou V): ", produto);
			categoria = sc.next().charAt(0);
			categoria = Character.toUpperCase(categoria);

			if (categoria == 'C') {
				System.out.printf("Insira o pre�o unit�rio do produto %d: ", produto);
				preco = sc.nextDouble();
				precoImposto = preco * 1.3741;
				precoLucro = precoImposto * 1.3;
				System.out.printf("O valor do produto %d com 37,41 porcento de impostos ser� de R$%.2f, sendo R$%.2f de impostos.\n", produto, precoImposto, precoImposto - preco);
				System.out.printf("O valor do produto %d j� com impostos e com 30 porcento de lucro ser� de R$%.2f, sendo R$%.2f de lucro.\n", produto, precoLucro, precoLucro - precoImposto);
				System.out.printf("Insita a quantidade do produto %d: ", produto);
				quantidade = sc.nextInt();
				produto++;
				totalC += (precoLucro * quantidade);
			} else if (categoria == 'E') {
				System.out.printf("Insira o pre�o unit�rio do produto %d: ", produto);
				preco = sc.nextDouble();
				precoImposto = preco * 1.4314;
				precoLucro = precoImposto * 1.35;
				System.out.printf("O valor do produto %d com 43,14 porcento de impostos ser� de R$%.2f, sendo R$%.2f de impostos.\n", produto, precoImposto, precoImposto - preco);
				System.out.printf("O valor do produto %d j� com impostos e com 35 porcento de lucro ser� de R$%.2f, sendo R$%.2f de lucro.\n", produto, precoLucro, precoLucro - precoImposto);
				System.out.printf("Insita a quantidade do produto %d: ", produto);
				quantidade = sc.nextInt();
				produto++;
				totalE += (precoLucro * quantidade);
			} else if (categoria == 'V') {
				System.out.printf("Insira o pre�o unit�rio do produto %d: ", produto);
				preco = sc.nextDouble();
				precoImposto = preco * 1.3842;
				precoLucro = precoImposto * 1.5;
				System.out.printf("O valor do produto %d com 38,42 porcento de impostos ser� de R$%.2f, sendo R$%.2f de impostos.\n", produto, precoImposto, precoImposto - preco);
				System.out.printf("O valor do produto %d j� com impostos e com 50 porcento de lucro ser� de R$%.2f, sendo R$%.2f de lucro.\n", produto, precoLucro, precoLucro - precoImposto);
				System.out.printf("Insita a quantidade do produto %d: ", produto);
				quantidade = sc.nextInt();
				produto++;
				totalV += (precoLucro * quantidade);
			} else {
				System.out.println("A categoria inserida � inv�lida!");
			}
		}

		System.out.printf("\nO valor total dos produtos de cama, mesa e banho � de R$%.2f.\n", totalC);
		System.out.printf("O valor total dos produtos de eletrodom�stico � de R$%.2f.\n", totalE);
		System.out.printf("O valor total dos produtos de vestu�rio � de R$%.2f.\n", totalV);

		sc.close();

	}

}
