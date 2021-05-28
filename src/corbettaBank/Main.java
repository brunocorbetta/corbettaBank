package corbettaBank;

public class Main {

	public static void main(String[] args) {
		Cliente bruno = new Cliente(); 
		bruno.setNome("bruno de melo corbetta");
		bruno.setCpf("335.778.887-77");

		Cliente lu = new Cliente(); 
		lu.setNome("luciana bueno");
		lu.setCpf("330.554.789-88");


		Conta conta1 = new Conta("0502", "14567", 0, bruno);


		Conta conta2 = new Conta("0502", "14568", 0, lu);




		conta1.deposita(3000);
		conta2.deposita(1000);

		conta1.transfere(3000, conta2);

		conta1.pegaSaldo();
		conta2.pegaSaldo();
		
		

	}


}
