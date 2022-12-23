package main;
import java.util.Scanner;


public class Exercicio_1047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int hi = sc.nextInt();
		int mi = sc.nextInt();
		int hf = sc.nextInt();
		int mf = sc.nextInt();
	
		
		int mhi= hi * 60 + mi;
		int mhf = hf * 60 + mf ;
		int ht = 24 * 60;
		int resultado = 0;
		
		if(hf > hi) {
			resultado = mhf -mhi;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S) \n", (resultado/60),(resultado%60));
		}else if(mhi > mhf) {
			resultado = (ht - mhi) + mhf;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S) \n", (resultado/60),(resultado%60));
		}else {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S) \n", 24,0);

		}
		
		sc.close();
	}

}
