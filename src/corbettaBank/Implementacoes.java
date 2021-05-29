package corbettaBank;

public class Implementacoes {

	public static void main(String[] args) {
		Cliente bruno = new Cliente();
		bruno.setNome("Bruno Corbetta");
		bruno.setCpf("345.889.546-77");
		bruno.setSexo("M");
		
		Cliente lu = new Cliente();
		lu.setNome("Luciana Bueno");
		lu.setCpf("345.889.446-77");
		lu.setSexo("F");

		Conta contaBruno = new ContaCorrente("0502", "7766", bruno);
			System.out.println("Conta Criada seu saldo é de R$ " + contaBruno.getSaldo() + " " + bruno.getNome());
			
		Conta contaLu = new ContaPoupanca("0502", "7766=7", lu);
			System.out.println("Conta Criada seu saldo é de R$ " + contaLu.getSaldo() + " " + lu.getNome());
			
			
			contaBruno.transfere(200, contaLu);
			contaBruno.deposita(300);
			contaLu.saca(150);
			
			System.out.println(contaBruno.getSaldo());
			System.out.println( contaLu.getSaldo());
			
			
	}

}
