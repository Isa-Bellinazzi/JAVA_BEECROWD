import java.util.Scanner;

public class exercicio_1038 {
	public static void main (String[] args) {
		 Scanner scan = new Scanner(System.in);
			int X = scan.nextInt(); // código
			int Y = scan.nextInt(); // Quantidade
		    double total = 0.00;
		    
			if (X == 1){
			total= Y * 4.00;
			}
			else if (X == 2) {
			total= Y * 4.50;
			}
			else if (X == 3) {
			total= Y * 5.00;
			}
			else if (X == 4) {
			total= Y * 2.00;
			}
			else if (X == 5) {
			total= Y * 1.50;
			}
			
			System.out.println(String.format("Total R$ %.2f", total));
			scan.close();	
			}
		}
