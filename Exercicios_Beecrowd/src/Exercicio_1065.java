
import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio_1065 {
 
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
		int contador = 0;
		int num = 0;
		
		for(int i = 0; i < 5; i++ ) {
			 num = sc.nextInt();
			if(num%2 == 0) {
				contador++;
			}
		
		}
		System.out.println(String.format("%d valores pares", contador));
		sc.close();
	}

}
