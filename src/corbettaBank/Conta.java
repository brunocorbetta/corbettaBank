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
}
