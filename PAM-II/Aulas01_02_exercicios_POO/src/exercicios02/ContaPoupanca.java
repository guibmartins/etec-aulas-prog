package exercicios02;

public class ContaPoupanca extends ContaBancaria {
	
	private int diaRendimento;
	
	public ContaPoupanca(String nome, int numConta, int diaRendimento) {
		
		super(nome, numConta);
		this.diaRendimento = diaRendimento;
	}
	
	public int getDiaRendimento() {
		
		return this.diaRendimento;
	}
	
	public void setDiaRendimento(int diaRendimento) {
		
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo(double taxaRendimento) {
		
		double novoSaldo = 1 + (this.getSaldo() * (taxaRendimento / 100.0));
		this.setSaldo(novoSaldo);	
		this.mostrarSaldo();
	}
}
