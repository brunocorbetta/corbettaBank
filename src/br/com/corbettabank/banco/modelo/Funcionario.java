package br.com.corbettabank.banco.modelo;


/**
 * classe par fazer qualque tipo de pessoa no meu projeto.
 * 
 * @author bruno corbetta
 *
 */

public abstract class Funcionario extends Pessoa implements Gratificacao, Autentica {

	private double salario;
	private double senha;
	private double nivelDoCargo;

	public boolean autentica(int senhaDigitada) {
		if(senhaDigitada == senha) {
			System.out.println("Acesso Liberado");
			return true;}
		else {
			System.out.println("Acesso negado");
			return false;
		}
	}


	public double getSalario() {
		return salario;
	}

	public double getSenha() {
		return senha;
	}


	public void setSenha(double senha) {
		this.senha = senha;
	}


	public double setSalario(double salario) {
		this.salario = salario;
		return salario;
	}

	public double bonificacao(double nivelDoCargo) {
		double gratificacao = this.salario * nivelDoCargo;
		System.out.println(gratificacao);
		return gratificacao;
	}


	public double getNivelDoCargo() {
		return nivelDoCargo;
	}


	public void setNivelDoCargo(double ivelDoCargo) {
		this.nivelDoCargo = ivelDoCargo;
	}

}
