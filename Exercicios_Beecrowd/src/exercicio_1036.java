

import java.util.Scanner;


public class exercicio_1036 {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		double Delta = (B*B) - 4*A*C;
		
		if(Delta > 0 && A > 0) {
		double R1 = ((- B) + Math.sqrt(Delta)) / (2 * A);
		
		double R2 = ((- B) - Math.sqrt(Delta))/(2 * A);
		
		System.out.println(String.format("R1 = %.5f", R1));
		System.out.println(String.format("R2 = %.5f", R2));
		}
		else{
			System.out.println("cálculo impossível");

		}
		scan.close();
		
	}

}
