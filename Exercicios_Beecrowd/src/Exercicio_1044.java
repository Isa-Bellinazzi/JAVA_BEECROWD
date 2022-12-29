import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Exercicio_1044 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int diva = a/b;
		int divb = b/a;

		if(a > b && diva == a || a > b && diva * b == a || diva == 2) {
			System.out.println("Sao Multiplos");
		}else if(a < b && divb == a || a < b && divb * a == b || a < b && divb == 2) {
			System.out.println("Sao Multiplos");

		}else {
			System.out.println("Nao sao Multiplos");
		}
		sc.close();
	}
}