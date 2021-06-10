import java.util.Scanner;

public class Ejercicio10{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int mult = 0;
		int decena = 0;
		while (total <= 1000) {
			System.out.println("\nIntroduce un número");
			int muestra = scanner.nextInt();
			total += muestra;
			if ((muestra % 6) == 0) {
				mult++;
			}
			if (muestra <= 10 && muestra >= 0) {
				decena++;
			}
		}
		System.out.println("\nSe ha llegado o sobrepasado el número mil con " + total + ", se encontraron " + mult + " multiplos de 6 y " + decena + " números entre 0 y 10");
	}
}