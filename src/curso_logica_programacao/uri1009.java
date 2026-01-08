package curso_logica_programacao;

import java.util.Locale;
import java.util.Scanner;

public class uri1009 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name = sc.next();
		double salary = sc.nextDouble();
		double sales = sc.nextDouble();

		double totalSalary = (sales * 0.15) + salary;

		System.out.printf("TOTAL = R$ %.2f%n", totalSalary);

		sc.close();
	}

}
