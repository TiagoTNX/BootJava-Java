package sequencial;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, n4;
		
		System.out.println("Digite N1: ");
		n1 = sc.nextDouble();
		System.out.println("Digite N2: ");
		n2 = sc.nextDouble();
		System.out.println("Digite N3: ");
		n3 = sc.nextDouble();
		System.out.println("Digite N4: ");
		n4 = sc.nextDouble();
		
		System.out.printf("As notas s�o %.1f, %.1f, %.1f, %.1f\n", n1, n2, n3, n4);
		System.out.printf("A m�dia ponderada � %.1f", (n1*2 + n2*2 + n3*3 + n4*3) / 10);

		sc.close();
	}

}
