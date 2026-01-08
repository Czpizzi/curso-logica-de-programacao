package curso_logica_programacao;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, horas, resto, minutos, segundos;

		N = sc.nextInt();
		resto = N % 3600;

		horas = N / 3600;

		minutos = resto / 60;
		segundos = resto % 60;

		System.out.println(horas + ":" + minutos + ":" + segundos);

	}

}
