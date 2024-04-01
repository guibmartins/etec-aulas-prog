package principal;
import exercicios02.*;

public class RunLista02 {

	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca("Guilherme Brandão", 1000, 05);
		cp.depositar(500);
		cp.calcularNovoSaldo(3); // 3% de taxa de rendimento
		
		ContaEspecial ce = new ContaEspecial("Guilherme Brandão", 1000, 05);
		ce.setLimite(800);
		ce.depositar(12500);
		ce.mostrarSaldo();
		ce.sacar(850);
	}

}
