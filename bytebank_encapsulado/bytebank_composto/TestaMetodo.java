
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoIgor = new Conta();
		contaDoIgor.saldo = 100;
		contaDoIgor.deposita(50);
		System.out.println(contaDoIgor.saldo);
		
		boolean conseguiuretirar = contaDoIgor.saca(20);
		System.out.println(contaDoIgor.saldo);
		System.out.println(conseguiuretirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia =contaDaMarcela.transfere(1000, contaDoPaulo);

				if(sucessoTransferencia) {
				System.out.println("Transferência realizada com sucesso");	
				}else { 
					System.out.println("Faltou dinheiro");
					}
		if(contaDaMarcela.transfere(300,contaDoPaulo)) {
			System.out.println("Transferência com sucesso");
		}else {
			System.out.println("Dinheiro em conta insuficiente");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoIgor.saldo );
		
		contaDoPaulo.titular = "paulo silveira";
		System.out.println(contaDoIgor.titular);
	}

}