import java.util.Scanner;

public class Exercicio_1073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cont = 0;
		
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				cont = i * i;
				System.out.println(i + "^2 =" + cont);
			}
		}

		sc.close();
	}
}
