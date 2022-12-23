package main;

import java.util.Scanner;

public class Exercicio_1071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int valsoma = 0;
		if (X > Y) {
			for (int i = Y + 1; i < X; i++) {
				if (i % 2 != 0)
					valsoma += i;
			}
		} else {
			for (int i = X + 1; i < Y; i++) {
				if (i % 2 != 0)
					valsoma += i;
			}
		}
		sc.close();
		System.out.printf("%d", valsoma);
	}

}
