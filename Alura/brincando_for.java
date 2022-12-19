
public class brincando_for {
	public static void main(String[] args) {
		for(int linha = 0; linha <=7;linha++) {
			
			for(int coluna = 0; coluna <= 7; coluna++) {
				if(linha == 0 && coluna <= 5 && linha == 0 && coluna>=1 || linha == 0 && coluna>=1 && linha == 2 && coluna <= 5) {
					System.out.print("*");
				}else if (coluna == 1 || coluna == 5) {
					System.out.print("*");
			}
				else if(coluna == 7 || coluna == 0) {
					System.out.print("_");
				}
				else {
				System.out.print("_");
			}
				
			}
		}
		
	}
}
