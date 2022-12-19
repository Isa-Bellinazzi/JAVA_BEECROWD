import java.io.IOException;
import java.util.Scanner;


public class excercicio_1018 {
    public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in); // Criando Scanner e o invocando
    
    	
    	int n = scan.nextInt();
    	int auxn2 = n;
    	
    	int nota100 = auxn2/100;
    	auxn2 = auxn2%100; 
    	
    	int nota50 = auxn2/50;
    	auxn2 = auxn2%50;
    	
    	int nota20 = auxn2/20;
    	auxn2 = auxn2%20;
    			
      	int nota10 = auxn2/10;
    	auxn2 = auxn2%10;
    	
     	int nota5 = auxn2/5;
    	auxn2 = auxn2%5;
    	
    	int nota2 = auxn2/2;
    	auxn2 = auxn2%2;
    	
    	int nota1 = auxn2/1;
    	auxn2 = auxn2%1;
    	
    	System.out.println(String.format("%d notas(s) de R$ 100,00",nota100));
    	System.out.println(String.format("%d notas(s) de R$ 50,00",nota50));
    	System.out.println(String.format("%d notas(s) de R$ 20,00",nota20));
    	System.out.println(String.format("%d notas(s) de R$ 10,00",nota10));
    	System.out.println(String.format("%d notas(s) de R$ 5,00",nota5));
    	System.out.println(String.format("%d notas(s) de R$ 2,00",nota2));
    	System.out.println(String.format("%d notas(s) de R$ 1,00",nota1));

scan.close();
  }
}