import java.util.Scanner;

public class avaliacao_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número ímpar, " + "que seja maior que 1: ");
		int num = sc.nextInt();
		char carecter = 'X';
		char space = ' ';
		int sub = (num - 1);
		int meio = (num/2);

		if (num % 2 != 0 && num != 1 && num > 0) {
			for (int linha = 0; linha <= num; linha++) {
				for (int coluna = 0; coluna <= num; coluna++) {
					if (linha == 0 && coluna <= sub 
							|| linha == sub && coluna <= sub 
							|| linha == meio && coluna <= meio) {
						System.out.print(carecter);

					} else if (coluna == 0 && linha <= sub 
							  || coluna == sub && linha <= sub
							  || coluna == meio && linha >= meio && coluna == meio && linha < num) {
						System.out.print(carecter);

					} else {
						System.out.print(space);

					}

				}
				System.out.println();
			}

		} else if (num == 1) {
			System.out.println("Número ímpar inválido! O número ímpar precisa ser maior que 1");
		} else if (num < 0) {
			System.out.println("Número inválido!");

		} else {
			System.out.println("Número inválido!");
		}
		sc.close();

	}
}
