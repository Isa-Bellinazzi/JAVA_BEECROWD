package main;

import java.util.Scanner;

public class Exercicio_1066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contpar = 0;
		int contimp = 0;
		int negative = 0;
		int positive = 0;
		int num = 0;
		
		for (int i = 0; i < 5; i++) {
			num = sc.nextInt();
			if(num > 0) {
				positive++;
			}else if(num < 0){
				negative++;
			}if(num%2 == 0) {
				contpar++;
			}else{
				contimp++;
			}
		}
		System.out.println(String.format("%d valor(es) par(es)",contpar));
		System.out.println(String.format("%d valor(es) impar(es)",contimp));
		System.out.println(String.format("%d valor(es) positivo(s)",positive));
		System.out.println(String.format("%d valor(es) negativo(s)",negative));
		sc.close();
	}

}
