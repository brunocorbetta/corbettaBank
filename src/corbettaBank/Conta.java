package corbettaBank;

public class Conta {
	private String agencia;
	private String numero;
	private double saldo;
	private Cliente titular;
	
	public Conta(String agencia, String numero, double saldo) {
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return this.saldo;
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
	
	public void deposita(double valor) {
		this.saldo = saldo + valor;
		System.out.println("Deposito efetuado com sucesso, seu novo saldo é R$" + this.getSaldo());
	}
	
	public void saca(double valor) {
		this.saldo = saldo - valor;
		System.out.println("Saque efetuado com sucesso, seu novo saldo é R$" + this.getSaldo());
	}
}
