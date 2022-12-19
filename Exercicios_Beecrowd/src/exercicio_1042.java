import java.util.Scanner;

public class exercicio_1042 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a < b && a < c) {
			if (b > c) {
				System.out.println(a);
				System.out.println(c);
				System.out.println(b);

			} else if (b < c) {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);

			}
		} else if (a > b && a > c) {
			if (b > c) {
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);

			} else if (c > b) {
				System.out.println(b);
				System.out.println(c);
				System.out.println(a);

			}
		} else if (c > a && c > b) {
			if (b > a) {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);

			} else if (a > b) {
				System.out.println(b);
				System.out.println(a);
				System.out.println(c);

			}
		} else if (c < a && c < b) {
			if (a > b) {
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);

			} else if (a < b) {
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);

			}
		}
				System.out.println();
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
		sc.close();

	}
}		
