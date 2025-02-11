package condicional;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double peso, altura;
		String classificacao;

		System.out.println("Informe o peso: ");
		peso = sc.nextDouble();
		System.out.println("Informe a altura: ");
		altura = sc.nextDouble();

		double imc = peso / Math.pow(altura, 2);

		if (imc < 18.5) {
			classificacao = "abaixo do peso";
		} else if (imc < 25) {
			classificacao = "peso normal";
		} else if (imc < 30) {
			classificacao = "sobrepeso";
		} else if (imc < 35) {
			classificacao = "obesidade n�vel I";
		} else if (imc < 40) {
			classificacao = "obesidade n�vel II";
		} else {
			classificacao = "obesidade m�rbida";
		}

		System.out.printf("\nO seu IMC � %.2f" + 
				" " + "est� classificado como %s.", imc, classificacao);

		sc.close();

	}

}
