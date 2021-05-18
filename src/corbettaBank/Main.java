package corbettaBank;

public class Main {

	public static void main(String[] args) {
		Conta conta1 = new Conta("0502", "14567", 0);
		System.out.println(conta1.getAgencia() + conta1.getNumero());
	}

}
