import java.io.IOException;
import java.util.Scanner;

public class exercicio_1020 {

    public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	int idade = scan.nextInt();
    	int auxidade = idade;
    	
    	int ano = auxidade/365;
    	auxidade = auxidade%365;
    	
    	int mes = auxidade/30;
    	auxidade = auxidade%30;
    	
    	int dia = auxidade/1;
    	auxidade = auxidade%1;
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
    	System.out.println(String.format("%d ano(s)", ano));
    	System.out.println(String.format("%d mês(es)", mes));
    	System.out.println(String.format("%d dia(s)", dia));

    	scan.close();
    }
 
}


