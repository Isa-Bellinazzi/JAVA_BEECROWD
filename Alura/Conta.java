
public class Conta {
	double saldo;
	int agencia = 42;
	int numero;
	String titular;
    String cpf; 
    String profissão;
    
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
	
}
