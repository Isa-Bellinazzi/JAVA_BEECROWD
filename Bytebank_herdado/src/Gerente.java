
public class Gerente extends Funcionarios {

	//Gerente é um Funcionario, Gerente herda da classe Funcionario


	        private int senha;

	        public void setSenha(int senha) {
	            this.senha = senha;
	        }

	        public boolean autentica(int senha) {
	            if(this.senha == senha) {
	                return true;
	            } else {
	                return false;
	            }
	        }

	        public double getBonificacao() {
                return (this.salario * 0.1) + super.salario;
            }

	}