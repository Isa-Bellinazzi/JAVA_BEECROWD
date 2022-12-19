package bytebank_encapsulado;

public class Conta {

	private double saldo = 100;
	private int agencia;
	private int numero;
	private static int total;
	private Cliente titular = new Cliente();
	
	public Conta(int agencia, int numero) { 
        total ++;
        System.out.println("o total de contas é " + total);
        this.agencia = agencia; 
        this.numero = numero; 
        System.out.println("estou criando uma conta " + this.numero); 
    }

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
		if (this.saldo >= valor) {
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

	public int getNumero() {
		return this.numero;
	}
    public void setNumero(int novoNumero) { 
    	if (numero <= 0) {
            System.out.println("não pode valor <= 0");
            return;
        }
        this.numero = novoNumero;
    }  
    public int getAgencia() {
		return this.agencia;
	}
    public void setTitular(Cliente titular) { 
        this.titular = titular; 

    }
    public Cliente getTitular() {
        return titular;
    }

	public void setAgencia(int i) {
		  if (agencia <= 0) { 
	            System.out.println("nao pode valor menor igual a 0");
	            return;
	        }
        this.agencia = agencia; 
		
	}
	public static int getTotal() { 
	    return Conta.total; 
	}
	
    
}

