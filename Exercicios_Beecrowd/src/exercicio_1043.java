import java.util.Scanner;

public class exercicio_1043 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double perimitro = a + b + c;
		
		if( a + b > c && b + c > a && c + a >b) {
			System.out.print(String.format("Perimitro = %.1f",perimitro));
		}else {
			double trapezio = (0.5 * c)*(a + b);
			System.out.print(String.format("Area = %.1f",trapezio));
		}
		
		sc.close();
	}

}
