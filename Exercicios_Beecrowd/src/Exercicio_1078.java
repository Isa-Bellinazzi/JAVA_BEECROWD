import java.util.Scanner;

public class Exercicio_1078 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();
		 int multi;
		 
		for(int i = 1; i <= 10; i++) {
			multi = i * N;
			
			System.out.printf("%d x %d = %d%n",i, N, multi);

		}
		 
		
		sc.close();
	}

}
