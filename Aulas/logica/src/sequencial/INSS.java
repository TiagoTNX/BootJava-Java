package sequencial;

import java.util.Scanner;

public class INSS {

	public static void main(String[] args) {
		
		double salarioBruto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o sal�rio bruto: ");
		salarioBruto = sc.nextDouble();
		
		salarioBruto = salarioBruto * (1 - 0.11);
		
		System.out.printf("O sal�rio ap�s o desconto do INSS � de R$%.2f", salarioBruto);
		
		sc.close();

	}

}
