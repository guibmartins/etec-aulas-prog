package abstracao_encapsulamento;

public class Pessoa {

	// atributos com acesso público
	public String nome;
	public String data_nasc;
	public String contato;
	
	// atributo com acesso privado
	private int sexo_bio;
	
	// construtor da classe Pessoa
	public Pessoa() {
		
	}
	
	public void mostrarInformacoes() {
		
		System.out.println("INFORMAÇÕES DA PESSOA");
		System.out.println("Nome completo: " + nome);
		System.out.println("Data nascimento: " + data_nasc);
		System.out.println("Sexo biológico: " + this.getSexoBiologico());
		
	}
	
	public String getSexoBiologico() {
		if (this.sexo_bio == 0) {
			return "feminino";
		} else
			return "masculino";
		
	}
	
	public void setSexoBiologico(String sexo) {
		
		if (sexo.contentEquals("feminino")) {
			// sexo feminino
			this.sexo_bio = 0;
		} else {
			// sexo masculino
			this.sexo_bio = 1;
		}
	}

}
