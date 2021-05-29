package corbettaBank;

public class Gerente extends Funcionario {
	
	public Gerente(String nome, String sexo, double salario, double senha, double nilvelDoCardo) {
		super.setNome(nome);
		super.setSexo(sexo);
		super.setSalario(salario);
		super.setSenha(senha);
		super.setNivelDoCargo(nilvelDoCardo);
	}
}

