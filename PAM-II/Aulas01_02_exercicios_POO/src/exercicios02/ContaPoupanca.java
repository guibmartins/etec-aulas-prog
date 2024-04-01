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
		
		double novoSaldo = 0.0;
		
		if ((taxaRendimento >= 0) && (taxaRendimento <= 100)) {
			
			novoSaldo = this.getSaldo() * (1 + (taxaRendimento / 100.0));
			this.setSaldo(novoSaldo);	
			this.mostrarSaldo();
			
		} else {
			
			System.out.println("A taxa de rendimento deve ser um valor entre 0% e 100%!");
		}	
	}
}
