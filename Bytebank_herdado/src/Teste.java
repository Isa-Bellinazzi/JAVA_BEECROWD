
public class Teste {
	public static void main(String[] args) {
	Funcionarios Desenvolvedor_Jr = new Funcionarios();
	Funcionarios Desenvolvedor_PL = new Funcionarios();
	Funcionarios Desenvolvedor_SR = new Funcionarios();
	Desenvolvedor_Jr.setSalario(3000.0);
	System.out.println("Tipo de Funcionário: " + Desenvolvedor_Jr.getTipo());
	System.out.println("Sua Bonificação terá o valor total de:" + Desenvolvedor_Jr.getBonificacao());
	System.out.println();

	Desenvolvedor_PL.setSalario(5000.0);
	Desenvolvedor_PL.setTipo(1);
	System.out.println("Tipo de Funcionário: " + Desenvolvedor_PL.getTipo());
	System.out.println("Sua Bonificação terá o valor total de:" + Desenvolvedor_PL.getBonificacao());
	System.out.println();

	
	Desenvolvedor_SR.setSalario(10000.0);
	Desenvolvedor_SR.setTipo(2);
	System.out.println("Tipo de Funcionário: " + Desenvolvedor_SR.getTipo());
	System.out.println("Sua Bonificação terá o valor total de:" + Desenvolvedor_SR.getBonificacao());
	}

}
