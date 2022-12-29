import java.util.Scanner;

public class Exercicio_1060 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 0;

		for (int i = 0; i < 6; i++) {
			int n = sc.nextInt();

			if (n >= 0) {
				contador++;
			}

		}
		System.out.printf("%d valores Positivos%n", contador);
		sc.close();
	}

}
