package abstracao_encapsulamento;

public class Carro {
	
	public String fabricante;
	public String modelo;
	public int ano;
	public String cor;
	public boolean farol_ligado;
	public boolean motor_ligado;
	public float velocidade;
	
	// construtor padrão da classe Carro
	public Carro() {
		System.out.println("Instanciando a classe Carro com construtor padrão");
	}

	// construtor com parâmetros da classe Carro
	public Carro(String fabricante, String modelo, int ano) {
		
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		
		// inicializando atributos públicos
		this.farol_ligado = false;
		this.motor_ligado = false;
		this.velocidade = 0;
	}
	
	public void mostrarInformacao() {
		
		System.out.println("INFORMAÇÕES DO VEÍCULO");
		System.out.println("Fabricante: " + fabricante);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Cor: " + cor);
		System.out.println();
	}
	
}

