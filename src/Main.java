import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] agrs) {
		List<Conta> contas = new ArrayList<Conta>();
		
		
		Cliente Thayzi = new Cliente();
		Thayzi.setNome("Thayzi");
		contas.add(new ContaCorrente(Thayzi));
		contas.add(new ContaPoupanca(Thayzi));
		
		Cliente Joao = new Cliente();
		Joao.setNome("Joao");
		contas.add(new ContaCorrente(Joao));
		contas.add(new ContaPoupanca(Joao));
		
		Cliente Maria = new Cliente();
		Maria.setNome("Maria");
		contas.add(new ContaCorrente(Maria));
		contas.add(new ContaPoupanca(Maria));
		
		Cliente Jose = new Cliente();
		Jose.setNome("Jose");
		contas.add(new ContaCorrente(Jose));
		contas.add(new ContaPoupanca(Jose));
		
		Cliente Joaquim = new Cliente();
		Joaquim.setNome("Joaquim");
		contas.add(new ContaCorrente(Joaquim));
		contas.add(new ContaPoupanca(Joaquim));
		
		
		Banco banco = new Banco();
		banco.setNome("Dinheirinho");
		
		
		banco.setContas(contas);
		banco.ListaContas();
	}
}
