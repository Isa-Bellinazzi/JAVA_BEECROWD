
public class TesteFuncionario {


	public static void main(String[] args) {
		// Instanciando os objetos
		Funcionarios isabella = new Funcionarios();
		Funcionarios igor = new Funcionarios();
		Funcionarios guilherme = new Funcionarios();

		
		// Inserindo valores nos atributos através dos objetos
		isabella.setNome("Isabella Bellinazzi");
		isabella.setSalario(2200.00);
		isabella.setCpf("4518136080-7");
		igor.setNome("Igor Texeira");
		igor.setCpf("2349843890-9");
		igor.setSalario(2300.00);
		guilherme.setNome("Guilherme Muller");
		guilherme.setCpf("2469843810-8");
		guilherme.setSalario(2500.00);

		// Acessando os valores dos atributos referente ao objeto
		System.out.println(isabella.getNome());
		System.out.println(isabella.getCpf());
		System.out.println(isabella.getSalario());
		System.out.println("Seu salário mais a bonificação terá um valor total de:");
		System.out.println("R$" + isabella.getBonificacao());
		System.out.println("----------------------------------");
		System.out.println(igor.getNome());
		System.out.println(igor.getCpf());
		System.out.println(igor.getSalario());
		System.out.println("Seu salário mais a bonificação terá um valor total de:");
		System.out.println("R$" + igor.getBonificacao());
		System.out.println("----------------------------------");
		System.out.println(guilherme.getNome());
		System.out.println(guilherme.getCpf());
		System.out.println(guilherme.getSalario());
		System.out.println("Seu salário mais a bonificação terá um valor total de:");
		System.out.println("R$" + guilherme.getBonificacao());
	}

}


