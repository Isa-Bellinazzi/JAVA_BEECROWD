package main;

import java.util.Scanner;

public class Exercicio_1046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hi = sc.nextInt();
		int hf = sc.nextInt();
		int sub = 0;
		int ht = 24;
		int resto;
		
	     if(hi > hf) {
	    	sub = hi - hf;
	    	resto =  ht - sub;
	    	System.out.printf("O JOGO DUROU %d HORA(S)%n",resto);
	     }else if(hf > hi) {
	    	 sub =  hf -hi;
		    System.out.printf("O JOGO DUROU %d HORA(S)%n",sub);

	     }else if(hi == hf) {
		   System.out.printf("O JOGO DUROU %d HORA(S)%n",ht);

	     }
		
		sc.close();
	}

}
