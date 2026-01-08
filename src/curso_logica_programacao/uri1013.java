package curso_logica_programacao;

import java.util.Scanner;

public class uri1013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int formula = (a + b + Math.abs(a - b)) / 2;

		if (formula > c) {
			System.out.printf("%d eh o maior%n", formula);
		} else {
			System.out.printf("%d eh o maior%n", c);
		}

		sc.close();
	}

}
