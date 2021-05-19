package corbettaBank;

public class Main {

	public static void main(String[] args) {
		Cliente bruno = new Cliente(); 
			bruno.setNome("bruno de melo corbetta");
			bruno.setCpf("335.997.378-00");
		
		
		Conta conta1 = new Conta("0502", "14567", 0);
			conta1.setTitular(bruno);
			
			
			conta1.deposita(3000);
			conta1.saca(1000);
	}
	

}
