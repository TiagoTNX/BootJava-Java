package repeticao;

import java.util.Scanner;

public class MediaAlunosFor {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			double total = 0;
			int contador;

			for (contador = 0; contador <= 9; contador++) {
				System.out.printf("\n\nDigite a nota %d� nota: ", contador + 1);
				double nota = sc.nextDouble();
				total += nota;
			}

			double media = total / contador;

			System.out.printf("\n\nTotal de alunos da classe %d.\n", contador);
			System.out.printf("O total de notas dos alunos: %.1f\n.", total);
			System.out.printf("A m�dia da classe: %.1f.", media);

			sc.close();
		}

	}

}
