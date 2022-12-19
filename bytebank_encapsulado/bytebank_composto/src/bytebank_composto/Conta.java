package bytebank_composto;

public class Conta {
	private double saldo = 100;
	int agencia;
	int numero;
	Cliente titular = new Cliente();
	Cliente cpf;
	Cliente profissao;
	
	   
		void deposita(double valor) {
			this.saldo += valor;
		}

		public boolean saca(double valor) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			} else {
				return false;
			}
		}
		public boolean transfere(double valor, Conta destino) {
			if(this.saldo >= valor ) {
				this.saldo -= valor;
				destino.saldo += valor;
				destino.deposita(valor);
				return true;
			}
			return false;
			}
		  public double getSaldo() { 
		        return this.saldo;
		    }
		
	
}
