import java.util.Scanner;

public class Exercicio_1113 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = 0;
		int Y = 0;

		do {
			X = sc.nextInt();
			Y = sc.nextInt();
			if (X > Y) {
				System.out.println("Decrescente");
			}else if(Y > X) {
				System.out.println("Crescente");
			}else {
				break;
			}
		} while (X != Y);
		sc.close();

	}
}
