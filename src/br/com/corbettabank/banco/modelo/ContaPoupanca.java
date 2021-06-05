package br.com.corbettabank.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String agencia, String numero, Cliente titular) {		
		super(agencia, numero, titular);
		super.setSaldo(50);
		
	}
	
	

}
