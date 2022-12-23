package main;

import java.util.Scanner;

public class Exercicio_1070 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = num; i <= num + 11; i++) {
			
			if(i%2 != 0 )
			System.out.println(i);
		}
		sc.close();
	}
}


