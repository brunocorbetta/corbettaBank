package corbettaBank;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String agencia, String numero, double saldo, Cliente titular) {		
		super(agencia, numero, saldo, titular);
		super.setSaldo(50);
		
	}
	
	

}
