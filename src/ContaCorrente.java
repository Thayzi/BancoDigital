
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfoComuns();
	}

}