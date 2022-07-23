import java.util.Scanner;

public class ExecutarSistema {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		Cliente andre = new Cliente();
		andre.setNome("André Machado");
		
		Conta cc = new ContaCorrente(andre);
		System.out.println("Boa noite. Faça um depósito para desbloquear sua conta");
		System.out.println("Valor a ser depositado: R$");
		cc.depositar(scan.nextDouble());
		
		
		Conta poupanca = new ContaPoupanca(andre);
		cc.transferir(cc.saldo/3, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
