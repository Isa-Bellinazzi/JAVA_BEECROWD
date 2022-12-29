import java.util.Scanner;

public class Exercicio_1079 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double media = 0;
		
		for(int i = 0; i < N ; i++) {
			double N1 = sc.nextDouble();
			double N2 = sc.nextDouble();
			double N3 = sc.nextDouble();

			media = ((N1 * 2.0) + (N2 * 3.0) + (N3 * 5.0))/ 10.0;
			System.out.printf("%.1f%n", media);

		}
		
		
		sc.close();
	}

}
