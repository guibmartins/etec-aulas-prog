package exercicios01;

public class Lampada {
	
	private boolean status;
	private int potencia;
	
	public Lampada() {
		
		this.status = false;
		this.setPotencia(60);
	}
	
	public Lampada(int potencia) {
		this.status = false;
		this.setPotencia(potencia);
	}
	
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void ligar() {
		
		if (this.status == false) {
			this.status = true;
		}
		
		mostraStatus();
	}
	
	public void desligar() {
		
		if (this.status == true) {
			this.status = false;
		}
		
		mostraStatus();
	}
	
	public void mostraStatus() {
		
		if (this.status == true) {
			System.out.println("Status: ligada.");
		}
		else {
			System.out.println("Status: desligada.");
		}
	}
}
