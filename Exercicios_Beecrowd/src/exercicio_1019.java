import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class exercicio_1019 {
 
    public static void main(String[] args) throws IOException {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int naux = n;
         
         
         int hora = naux/3600;
         naux= naux%3600;
         
         int minutos = naux/60;
         naux = naux%60;
         
         int segundos = naux/1;
         naux = naux%60;
        		 
         
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         System.out.println(hora +":" + minutos +":"+ segundos);
 scan.close();
    }
 
}