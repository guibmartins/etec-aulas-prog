package exercicios02;

public class ContaEspecial extends ContaBancaria {

	private double limite;
	
	public ContaEspecial(String nome, int numConta, double limite) {
		super(nome, numConta);
		this.limite = limite;
	}

	public double getLimite() {
		return this.limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void sacar(float valor) {
		
		if (this.getSaldo() < valor) {
			
			System.out.printf("Saldo insufiente para saque de R$%.2f", valor);
			System.out.println();
		} else if (this.limite < valor){
			
			System.out.println("Valor excede o limite para saque!");
		} else {
			
			double novoSaldo = this.getSaldo() - valor;
			this.setSaldo(novoSaldo);
			this.mostrarSaldo();
		}
	}
	
}
