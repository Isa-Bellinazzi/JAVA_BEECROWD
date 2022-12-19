
public class array {
	public static void main(String[] args) {
		Funcionarios[] funcionarios = new Funcionarios[15];
		for(int i = 0; i< funcionarios.length; i++) {
			funcionarios[i]= new Funcionarios();
			funcionarios[i].nome = "Sérgio";
			funcionarios[i].nome = "Márcio";
			funcionarios[i].nome = "Stephanie";
 	}
	
	    for(Funcionarios c : funcionarios) {
	    	System.out.println(c.nome);
	    }
	    }

}

class Funcionarios{
	String nome;
}

//class FuncionariosEspeciais extends Funcionarios; 

