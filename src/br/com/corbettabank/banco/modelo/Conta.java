package br.com.corbettabank.banco.modelo;

/**
 * classe abstrata para fazer as contas filhos
 * 
 * @author bruno corbetta
 *
 */

public abstract class Conta {
	private String agencia;
	private int numero;
	private double saldo;
	private Cliente titular;
	public static int total;

	public Conta(String agencia, int numero, Pessoa titular) {
		total++;
		this.agencia = agencia;
		this.numero = numero;

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

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public  void deposita(double valor) {
		this.saldo = saldo + valor;

	}

	public void saca(double valor) {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
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
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return  "agencia " + this.getAgencia();
		}

}
