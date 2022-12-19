import java.util.Scanner;

public class exercicio_1037 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double valor = scan.nextDouble();
	
	if(valor > 25 ||valor <= 50) {
		System.out.println("Intervalo (25,50]");	
	}
	else if(valor == 0 || valor == 25) {
		System.out.println("Intervalo [0,25]");
	}
	else if(valor > 75 || valor <= 100) {
		System.out.println("Intervalo (75,100]");
	}
	else if(valor < 0) {
		System.out.println("Fora de intervalo ");	
	}
	
	scan.close();	
	}
}
