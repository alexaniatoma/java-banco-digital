
public class MainTeste {

	public static void main(String[] args) {
		Cliente alexania = new Cliente();
		alexania.setNome("Alexania");
		
		Conta contaCorrente = new ContaCorrente(alexania);
		contaCorrente.depositar(100);
		contaCorrente.sacar(50);
		
		Conta contaPoupanca = new Poupanca(alexania);
		contaCorrente.transferir(30, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
		
		
		Cliente celso = new Cliente();
		celso.setNome("Celso");
		
		ContaCorrente contaCelso = new ContaCorrente(celso);
		contaCelso.depositar(200);
		
		contaCelso.imprimirExtrato();

	}

}
