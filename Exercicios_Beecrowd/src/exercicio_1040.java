import java.util.Scanner;

public class exercicio_1040 {
	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
			float N1 = scan.nextFloat();
			float N2 = scan.nextFloat();
			float N3 = scan.nextFloat();
			float N4 = scan.nextFloat();
			float Media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;
			float NotaExame;

			if (Media >= 7.0) {
				System.out.println(String.format("Media: %.1f", Media));
				System.out.println("Aluno aprovado.");
			} else if (Media < 5.0) {
				System.out.println(String.format("Media: %.1f", Media));
				System.out.println("Aluno reprovado.");
			}

			else if (Media >= 5.0 && Media <= 6.9) {
				System.out.println("Nota do exame:");
				NotaExame = scan.nextFloat();
				float Mediafin = (NotaExame + Media) / 2;

				if (Mediafin >= 5.0) {
					System.out.println(String.format("Media: %.1f", Media));
					System.out.println("Aluno em exame.");
					System.out.println(String.format("Nota do exame: %.1f", NotaExame));
					System.out.println("Aluno aprovado.");
					System.out.println(String.format("Media final: %.1f", Mediafin));
				} else if (Mediafin <= 4.9) {
					System.out.println(String.format("Media: %.1f", Media));
					System.out.println("Aluno em exame.");
					System.out.println(String.format("Nota do exame: %.1f", NotaExame));
					System.out.println("Aluno reprovado.");
					System.out.println(String.format("Media final: %.1f", Mediafin));
				}
			}

			scan.close();
		}
	}
