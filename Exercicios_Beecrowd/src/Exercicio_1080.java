import java.util.Scanner;

public class Exercicio_1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int tamanho =100;
		int[] vet = new int[tamanho];
	    int comparador = 0;
	    int posicao = 0;
	    int diferenca =0;
	    
		for(int i = 1; i <= 10; i++) {
			 vet[i] = sc.nextInt();
			 
		        if(vet[i]> comparador && vet[i] > 0) {
		            comparador = vet[i];
		            posicao = tamanho - i;
		            diferenca = tamanho - posicao;
		        }    
		
		}
    	System.out.println(comparador);
    	System.out.println(diferenca);

				
		sc.close();
		
	}

}
