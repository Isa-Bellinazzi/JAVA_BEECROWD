import java.util.Scanner;

public class Exercicio_1072 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int X = sc.nextInt();
	int contador =0;
	int contfora = 0;
	
	for(int i = 0; i < X; i++){
	   int num = sc.nextInt();
	   
	   if(num >= 10 && num <= 20) {
		   contador+= 1;
	   }else if(num < 10 || num > 20 || num < 0) {
		   contfora += 1;
	   }
	}
	 System.out.println(contador + " em");		
	 System.out.println(contfora + " fora");	
		
	sc.close();
}
}
