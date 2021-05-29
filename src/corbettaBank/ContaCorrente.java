package corbettaBank;

public class ContaCorrente extends Conta {

	public ContaCorrente(String agencia, String numero, Cliente titular) {		
		super(agencia, numero, titular);
		super.setSaldo(300);
		
	}
	@Override
	public boolean transfere(double valor, Conta titular) {
		if(super.getSaldo() < valor) {
			System.out.println("Não ha saldo para essa transferencia.");
		} else {
			super.setSaldo(super.getSaldo() - valor);
			titular.deposita(valor);
			super.setSaldo(super.getSaldo() - 10);
			System.out.println("Transferencia efetuada com sucesso!");
		}
		return true;

	}
	
}
	
