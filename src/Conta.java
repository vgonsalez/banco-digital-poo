
public class Conta implements IConta {
	
	protected static final int AGENCIA_PADRAO = 0001;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		
	}
}
