package exercio_matriz;

public class Isabella_Matriz {
	public static void main(String[] args) {
		char caracterletra = '*';
		char caracterespace = ' ';

		for (int linha = 0; linha <= 5; linha++) { // Linhas geral
			for (int coluna = 0; coluna <= 6; coluna++) { // coluna letra I
				if (coluna == 3 && linha <= 0 || coluna == 3 && linha >=2 ) {
					System.out.print(caracterletra);
				} else {
					System.out.print(caracterespace);
				}
			}
			for (int coluna = 0; coluna <= 6; coluna++) { // coluna letra S
				if (linha == 0 && coluna <= 5 || linha == 2 && coluna <= 5 || linha == 5 && coluna <= 5) {
					System.out.print(caracterletra);
				} else if (coluna == 0 && linha < 3 || coluna == 5 && linha >= 3 && linha < 5) {
					System.out.print(caracterletra);
				} else {
					System.out.print(caracterespace);
				}
			}
			for (int coluna = 0; coluna <= 6; coluna++) { // coluna letra A
				if (linha == 0 && coluna <= 5 || linha == 2 && coluna <= 5) {
					System.out.print(caracterletra);
				} else if (coluna == 0 && linha < 6 || coluna == 5 && linha < 6) {
					System.out.print(caracterletra);
				} else {
					System.out.print(caracterespace);
				}
			}
			for (int coluna = 0; coluna <= 6; coluna++) { // Letra B
				if (linha == 0 && coluna <= 4 || linha == 5 && coluna <= 4 || linha == 4 && coluna == 5
						|| linha == 3 && coluna == 5 || linha == 2 && coluna == 3 || linha == 1 && coluna == 4) {
					System.out.print(caracterletra);
				} else if (coluna == 0 && linha <= 5) {
					System.out.print(caracterletra);
				} else {
					System.out.print(caracterespace);
				}
			}
			for (int coluna = 0; coluna <= 6; coluna++) { // coluna letra E
				if (linha == 0 && coluna <= 5 || linha == 2 && coluna <= 4 || linha == 5 && coluna <= 5) {
					System.out.print(caracterletra);
				} else if (coluna == 0 && linha <= 5) {
					System.out.print(caracterletra);
				} else {
					System.out.print(caracterespace);
				}
			}
			for (int coluna = 0; coluna <= 6; coluna++) { // Coluna letra L
				if (linha == 5 && coluna <= 5) {
					System.out.print(caracterletra);
				} else if (coluna == 0 && linha <= 5) {
					System.out.print(caracterletra);
				} else {
					System.out.print(caracterespace);
				}
			}
			for (int coluna = 0; coluna <= 6; coluna++) { // Coluna letra L
				if (linha == 5 && coluna <= 5) {
					System.out.print(caracterletra);
				} else if (coluna == 0 && linha <= 5) {
					System.out.print(caracterletra);
				} else {
					System.out.print(caracterespace);
				}
			}
			for (int coluna = 0; coluna <= 6; coluna++) { // coluna letra A
				if (linha == 0 && coluna <= 5 || linha == 2 && coluna <= 5) {
					System.out.print(caracterletra);
				} else if (coluna == 0 && linha < 6 || coluna == 5 && linha < 6) {
					System.out.print(caracterletra);
				} else {
					System.out.print(caracterespace);
				}
			}
			System.out.println();

		}
	}



}
