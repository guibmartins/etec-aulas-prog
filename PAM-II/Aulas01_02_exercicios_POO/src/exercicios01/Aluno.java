package exercicios01;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private int matricula;
	private String nome;
	private String curso;
	private List<String> disciplinas;
	private List<Double> notas;
	private double media_notas;
	
	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
		this.disciplinas = new ArrayList<String>();
		this.notas = new ArrayList<Double>();
		this.media_notas = 0;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public String getCurso() {
		return this.curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public List<String> getDisciplinas() {
		return this.disciplinas;
	}
	
	public List<Double> getNotas() {
		return this.notas;
	}

	public void addDisciplina_Nota(String nova_disciplina, double d) {
		
		this.disciplinas.add(nova_disciplina);
		this.notas.add(d);
	}
	
	public void calculaMediaNotas() {
		
		int n_notas = this.notas.size();
		double media_notas = 0;
		
		if (this.notas.isEmpty()) {
			
			System.out.printf("Não há notas cadastradas para o aluno %s.", this.nome);
			System.out.println();
		} else {
			
			for (Double nota : this.notas) {
				media_notas += nota;
			}
			
			media_notas = media_notas / (double)n_notas;
			this.media_notas = media_notas;
			
			System.out.printf("Média das notas: %.3f", (float)media_notas);
			System.out.println();
			this.verificaAprovacao();
		}
	}
	
	public void verificaAprovacao() {
		
		if (this.media_notas >= 7) {
			
			System.out.println("Aprovado!");
		} else {
			
			System.out.println("Reprovado!");
		}
		
	}
	
	public void mostraDisciplinas() {
		
		System.out.println("DISCIPLINAS CADASTRADAS: ");
		
		for (String disciplina : this.disciplinas) {
			System.out.println(disciplina);
		}
		
	}

	public double getMedia_notas() {
		return media_notas;
	}
}
