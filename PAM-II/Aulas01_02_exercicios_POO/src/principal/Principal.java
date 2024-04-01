package principal;
import exercicios01.*;

public class Principal {

	public static void main(String[] args) {
		
		Lampada l1 = new Lampada();
		l1.ligar();
		l1.desligar();
		
		ContaCorrente cc = new ContaCorrente(123, 1230001);
		cc.consultarSaldo();
		cc.depositar(4000);
		cc.sacar(250);
		cc.mostrarDetalhesConta();
		cc.sacar(5000);
		
		Aluno a = new Aluno(13, "Guilherme Brandao Martins");
		a.setCurso("Ciencia da Computacao");
		a.addDisciplina_Nota("Estrutura de Dados", 8.5);
		a.addDisciplina_Nota("Programacao Mobile II", 7.0);
		a.addDisciplina_Nota("Banco de Dados II", 9.3);
		
		a.mostraDisciplinas();
		a.calculaMediaNotas();
	}

}
