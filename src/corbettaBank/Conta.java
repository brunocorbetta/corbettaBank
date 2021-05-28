package corbettaBank;

public class Conta {
	private String agencia;
	private String numero;
	private double saldo;
	private Cliente titular;
	public static int total;

	public Conta(String agencia, String numero, double saldo, Cliente titular) {
		total++;
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("total de contas criadas " + total);
	}


	public void pegaSaldo() {
		System.out.println("O saldo da è " + this.saldo);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public  void deposita(double valor) {
		this.saldo = saldo + valor;

	}

	public void saca(double valor) {
		if(this.saldo < valor) {
			System.out.println("saldo insuficiente");
		} else {
			this.saldo = saldo - valor;
			System.out.println("Saque efetuado com sucesso, seu novo saldo é R$" + this.getSaldo());
		}
	}

	public boolean transfere(double valor, Conta titular) {
		if(this.saldo < valor) {
			System.out.println("Não ha saldo para essa transferencia.");
		} else {
			this.saldo = saldo - valor;
			titular.deposita(valor);
			System.out.println("Transferencia efetuada com sucesso!");
		}
		return true;



	}


	public Cliente getTitular() {
		return titular;
	}


	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
