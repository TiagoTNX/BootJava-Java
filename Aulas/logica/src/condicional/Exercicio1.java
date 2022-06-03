package condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		String disciplina, resultado;
		int aulas, faltas;
		double nota1, nota2, nota3, nota4, media, presenca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o nome da disciplina: ");
		disciplina = sc.next();
		System.out.println("Insira o n�mero de aulas dadas: ");
		aulas = sc.nextInt();
		System.out.println("Insira a nota do primeiro bimestre do aluno 1: ");
		nota1 = sc.nextDouble();
		System.out.println("Insira a nota do segundo bimestre do aluno 1: ");
		nota2 = sc.nextDouble();
		System.out.println("Insira a nota do terceiro bimestre do aluno 1: ");
		nota3 = sc.nextDouble();
		System.out.println("Insira a nota do quarto bimestre do aluno 1: ");
		nota4 = sc.nextDouble();
		System.out.println("Insira o n�mero de faltas do aluno 1: ");
		faltas = sc.nextInt();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		presenca = 100 - ((faltas * 100) / aulas);
		
		if (media >= 6 && presenca >= 75) {
			resultado = "aprovado";
		} else {
			resultado = "reprovado";
		}
		
		System.out.printf("O aluno 1 teve a m�dia de %.2f pontos com presen�a de %.1f por cento e est� %s na disciplina de %s",
				media, presenca, resultado, disciplina);
		
		sc.close();

	}

}
