package bytebank_composto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente igor = new Cliente();
		igor.nome = "Igor Texeira";
		igor.cpf = "46781090345";
		igor.profissao = "Desenvolvedor Java";
		
		Conta contaDoIgor = new Conta();
		contaDoIgor.deposita(100);
		
		contaDoIgor.titular = igor;
		System.out.println(contaDoIgor.titular.nome);
		System.out.println(contaDoIgor.titular);
	}
}
