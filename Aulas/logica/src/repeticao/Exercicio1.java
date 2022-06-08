package repeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			double nota, media = 0;
			int aprovados = 0, reprovados = 0, aluno;

			for (aluno = 0; aluno <= 9; aluno++) {
				System.out.printf("\nInsira a nota do aluno %d�: \n", aluno + 1);
				nota = sc.nextDouble();

				if (nota < 6.0) {
					System.out.println("O aluno est� reprovado!");
					reprovados++;
				} else {
					System.out.println("O aluno est� aprovado!");
					aprovados++;
				}
				media += nota / 10;
			}

			System.out.printf("\nN�mero de alunos aprovados: %d.\nN�mero de alunos reprovados: %d.\n", aprovados,
					reprovados);
			System.out.printf("M�dia de nota da turma: %.1f.", media);

			sc.close();
		}
	}

}
