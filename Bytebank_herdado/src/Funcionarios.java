
public class Funcionarios {

	private String nome;
	private String cpf;
	protected double salario;
    private int tipo = 0;
    
    public void setTipo(int tipo){
    	this.tipo = tipo;
    }
    
    public int getTipo() {
    	return tipo;
    }
    
	public double getBonificacao() {
	    	return this.salario * 0.1;
	 
	}	    	
		public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
