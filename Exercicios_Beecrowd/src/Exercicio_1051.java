import java.util.Scanner;

public class Exercicio_1051 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double reajuste = 0;
		double salario = 0;

		if (num >= 2000.00 && num <= 400.00) {
			reajuste = num * 0.15;
			salario = num + reajuste;

			System.out.printf("isento");
		} else if (num >= 400.01 && num <= 800.00) {
			reajuste = num * 0.12;
			salario = num + reajuste;

			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println(String.format("Em percentual: 12 %%"));
			
		} else if (num >= 800.01 && num <= 1200.00) {
			reajuste = num * 0.10;
			salario = num + reajuste;

			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println(String.format("Em percentual: 10 %%"));
			
		}else if (num >= 1200.01 && num <= 2000.00) {
			reajuste = num * 0.07;
			salario = num + reajuste;

			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println(String.format("Em percentual: 7 %%"));
			
		}else if (num >= 2000.00) {
			reajuste = num * 0.04;
			salario = num + reajuste;

			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println(String.format("Em percentual: 4 %%"));
		}

		sc.close();
	}


	}


