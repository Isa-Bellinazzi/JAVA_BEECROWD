import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class exercicio_1021 {
 
    public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    float N = scan.nextFloat();
    float N2 = N;
    
    float nota100 = (int)N2/100;
    N2 = N2%100;
    
    float nota50 = (int)N2/50;
    N2 = N2%50;
    
    float nota20 = (int)N2/20;
    N2 = N2%20;
    
    float nota10 = (int)N2/10;
    N2 = N2%10;
    
    float nota5 = (int)N2/5;
    N2 = N2%5;
    
    float nota2 = (int)N2/2;
    N2 = N2%2;
    
    
    N2 = N2 *100;
    int N3= (int)(N2 + 0.5);
    
        
    float moeda1 = (int) N3/100;
    N3 = N3%100;
    
    float moeda2 = (int) N3/50;
    N3 = N3%50;
    
    float moeda3 = (int) N3/25;
    N3 = N3%25;
    
    float moeda4 = (int) N3/10;
    N3 = N3%10;
    
    float moeda5 = (int) N3/5;
    N3 = N3%5;
    
    float moeda6 = (int) N3/1;
    N3 = N3%1;
    
    
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
    System.out.println("NOTAS:");
    System.out.println(String.format("%.0f nota(s) de R$ 100.00", nota100));
    System.out.println(String.format("%.0f nota(s) de R$ 50.00", nota50));
    System.out.println(String.format("%.0f nota(s) de R$ 20.00", nota20));
    System.out.println(String.format("%.0f nota(s) de R$ 10.00", nota10));
    System.out.println(String.format("%.0f nota(s) de R$ 5.00", nota5));
    System.out.println(String.format("%.0f nota(s) de R$ 2.00", nota2));
    System.out.println("MOEDAS:");
    System.out.println(String.format("%.0f moeda(s) de R$ 1.00", moeda1));
    System.out.println(String.format("%.0f moeda(s) de R$ 0.50", moeda2));
    System.out.println(String.format("%.0f moeda(s) de R$ 0.25", moeda3));
    System.out.println(String.format("%.0f moeda(s) de R$ 0.10", moeda4));
    System.out.println(String.format("%.0f moeda(s) de R$ 0.05", moeda5));
    System.out.println(String.format("%.0f moeda(s) de R$ 0.01", moeda6));



    scan.close();
    }
 
}