import java.util.Scanner;

public class Exercicio_1074 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X;
		for(int i = 0; i < N; i++) {
			X = sc.nextInt();	
			if (X % 2 == 0 && X >0) {		
				System.out.println("EVEN POSITIVE");
			}else if(X % 2 == 0 && X <0) {
				System.out.println("EVEN NEGATIVE");
			}else if(X % 2 != 0 && X >0) {
				System.out.println("ODD POSITIVE");
			}else if(X % 2 != 0 && X <0) {
				System.out.println("ODD NEGATIVE");
			}else if(X == 0){
				System.out.println("NULL");

			}
		}
		
		sc.close();
	}

}
