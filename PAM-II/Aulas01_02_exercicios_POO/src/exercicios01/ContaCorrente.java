package exercicios01;

public class ContaCorrente {

	private int num_agencia;
	private int num_conta;
	private float saldo;
	private String status;
	
	public ContaCorrente(int num_agencia, int num_conta) {
		
		this.num_agencia = num_agencia;
		this.num_conta = num_conta;
		
		// Inicialmente, a conta não tem dinheiro algum. Logo, saldo = 0
		this.saldo = 0;
	}

	public float getSaldo() {
		return saldo;
	}

	public int getNum_agencia() {
		return num_agencia;
	}

	public int getNum_conta() {
		return num_conta;
	}
	
	public void depositar(float valor) {
		
		this.saldo = this.saldo + valor; 
		// ou this.saldo += valor;
	}
	
	public void sacar(float valor) {
		
		if (this.saldo < valor) {
			
			System.out.printf("Saldo insufiente para saque de R$%.2f", valor);
			System.out.println();
		} else {
			
			this.saldo -= valor;
			this.consultarSaldo();
		}
	}
	
	public void consultarSaldo() {
		
		System.out.printf("Saldo atual: R$%.2f", this.saldo);
		System.out.println();
	}
	
	public void mostrarDetalhesConta() {
		
		System.out.println("DETALHES DA CONTA:");
		System.out.printf("Agência: %d", this.num_agencia);
		System.out.println();
		System.out.printf("Num. conta: %d", this.num_conta);
		System.out.println();
	}
}
