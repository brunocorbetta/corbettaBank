package corbettaBank;

public abstract class Funcionario extends Pessoa implements Gratificacao, Autentica {

	private double salario;
	private double senha;

	public boolean getAutentica(int senhaDigitada) {
		if(senhaDigitada == senha) {
			System.out.println("Acesso Liberado");
			return true;}
		else {
			System.out.println("Acesso negdo");
			return false;
		}
	}


	public double getSalario() {
		return salario;
	}

	public double setSalario(double salario) {
		this.salario = salario;
		return salario;
	}

	public double getBonificacao(double nivelDoCargo) {
		return this.setSalario(getSalario() * nivelDoCargo);
	}

}
