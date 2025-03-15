
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("ana");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		cc.depositar(100);
		poupanca.transferir(150, poupanca);;
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
