import java.util.Scanner;

public class Exercicio_1101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int recebe = 0;
		int soma = 0;

		for (int i = 0; i < num; i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			if (N > M) {
				recebe = N;
				N = M;
				M = recebe;
			}
			for (int l = N; l <= M; l++) {
				if (l > 0 && l != 0) {
					soma += l;
				} else {
					break;
				}
				System.out.printf("%d ", l);
			}
			System.out.printf("sum=%d\n", soma);

		}
		sc.close();

	}
}
