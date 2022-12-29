import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Exercicio_1045 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double X = sc.nextDouble();
		double Y = sc.nextDouble();
		double Z = sc.nextDouble();
		double A = 0;
		double B = 0;
		double C = 0;

		if (X > Y && X > Z) {
			A = X;
			if (Y > Z) {
		    B = Y;C = Z;
			} else {
		    B = Z;C = Y;
			}
		} else if (Y > Z) {
			A = Y;
			if (X > Z) {
		    B = X; C = Z;
			} else {
		    B = Z; C = X;
			}
		} else {
			A = Z;
			if (X > Y) {
		     B = X;C = Y;
			} else {
		   B = Y; C = X;
			}
		}

		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if ((A * A) == (B * B) + (C * C)) {
				System.out.println("TRIANGULO RETANGULO");
			} else if ((A * A) > (B * B) + (C * C)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			} else {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (A == B && C == B) {
				System.out.println("TRIANGULO EQUILATERO");
			} else if (A == B || B == C || A == C) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		sc.close();

	}
}
