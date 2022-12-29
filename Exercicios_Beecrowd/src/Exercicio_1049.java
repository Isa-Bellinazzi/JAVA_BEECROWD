import java.util.Scanner;

public class Exercicio_1049 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tipo1 = sc.next();
		String tipo2 = sc.next();
		String tipo3 = sc.next();

		switch (tipo1) {
		case "vertebrado":
			switch (tipo2) {
			case "ave":
				switch (tipo3) {
				case "carnivoro":
					System.out.println("aguia");
					break;
				case "onivoro":
					System.out.println("pomba");
					break;
				}
				break;
			case "mamifero":
				switch (tipo3) {
				case "onivoro":
					System.out.println("homem");
					break;
				case "herbivoro":
					System.out.println("vaca");
					break;

				}
			}
			break;

		case "invertebrado":
			switch (tipo2) {
			case "inseto":
				switch (tipo3) {
				case "hematofago":
					System.out.println("pulga");
					break;
				case "herbivoro":
					System.out.println("lagarta");
					break;

				}
				break;
			case "anelideo":
				switch (tipo3) {
				case "hematofago":
					System.out.println("sanguessuga");
					break;
				case "onivoro":
					System.out.println("minhoca");
					break;

				}
				break;
			}
			break;
		}

		sc.close();
	}
}
