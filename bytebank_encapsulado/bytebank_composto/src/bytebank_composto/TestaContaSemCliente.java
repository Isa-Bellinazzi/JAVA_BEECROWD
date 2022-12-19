package bytebank_composto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contadoGui = new Conta();
		System.out.println(contadoGui.getSaldo());
		
		contadoGui.titular = new Cliente();
		System.out.println(contadoGui.titular.nome);

		
		contadoGui.titular.nome = "Guilherme";
		System.out.println(contadoGui.titular.nome);
	}

}
