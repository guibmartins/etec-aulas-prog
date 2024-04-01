package exercicios02;

public class ContaBancaria {
	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	public ContaBancaria(String nome, int numConta) {
		
		this.setNomeCliente(nome);
		this.setNumConta(numConta);
		this.saldo = 0;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
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
		}
	}
	
	public void mostrarSaldo() {
		
		System.out.printf("Saldo atual: R$ %.2f", this.saldo);
		System.out.println();
	}
}
