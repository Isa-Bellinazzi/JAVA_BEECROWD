import java.util.Scanner;

public class exercicio_1035 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int somacd = c + d;
		int somaab = a + b;

		
		if((b > c) && (d >a) && (somacd > somaab)  && (c >=0) && (d>= 0)  && (a%2 ==0) ) {
			System.out.println("Valores aceitos");
		}
		else {
			System.out.println("Valores nao aceitos");
		}
		scan.close();
	}
}