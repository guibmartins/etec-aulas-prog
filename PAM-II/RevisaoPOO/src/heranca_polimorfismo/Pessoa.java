package heranca_polimorfismo;

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
	
	public Pessoa(String nome, String data_nasc, String sexo) {
		
		this.nome = nome;
		this.data_nasc = data_nasc;
		this.setSexoBiologico(sexo);
	}
	
	public void mostrarInformacoes() {
		
		System.out.println("INFORMAÇÕES DA PESSOA");
		System.out.println("Nome completo: " + nome);
		System.out.println("Data nascimento: " + data_nasc + "(" + this.getIdade() + "anos)");
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

	public int getIdade() {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date data_nascimento;
		int idade = -1;
		
		try {
			data_nascimento = formatter.parse(this.data_nasc);
			Date data_atual = new Date();
			idade = data_atual.getYear() - data_nascimento.getYear();
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return idade;	
	}
}
