package corbettaBank;

public class TestaFuncionario {

	public static void main(String[] args) {
		Gerente corbetta = new Gerente("Bruno Corbetta", "M", 3000, 2412, 0.1);
		corbetta.bonificacao(corbetta.getNivelDoCargo());
		corbetta.autentica(2412);

		Programador luciana = new Programador("Luciana Bueno", "F", 5000, 4456, 0.5);
		luciana.bonificacao(luciana.getNivelDoCargo());
		luciana.autentica(2412);


		Conta conta01 = new ContaCorrente("0502", "5678-8", luciana);
		conta01.deposita(300);
		System.out.println(conta01.getSaldo());
	}

}
