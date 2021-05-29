package corbettaBank;

public class TestaFuncionario {

	public static void main(String[] args) {
		Gerente corbetta = new Gerente("Bruno Corbetta", "M", 3000, 2412, 0.1);
			corbetta.bonificacao(corbetta.getNivelDoCargo());
			corbetta.autentica(2412);
			
			
	}

}
