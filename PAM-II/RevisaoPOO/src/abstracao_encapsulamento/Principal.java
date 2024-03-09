package abstracao_encapsulamento;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Meu primeiro programa");
		
		Carro onix = new Carro();
		onix.fabricante = "Chevrolet";
		onix.modelo = "Onix LT 1.0";
		onix.ano = 2017;
		onix.cor = "branco";
		onix.mostrarInformacao();
		
		Carro ka = new Carro();
		ka.cor = "prata";
		
		Carro fox = new Carro("Volkswagen", "Fox", 2010);
		fox.cor = "branco";
		fox.mostrarInformacao();
		
		Pessoa p = new Pessoa();
		p.nome = "Guilherme Brandão";
		p.data_nasc = "13/01/1991";
		p.contato = "(14)997671640";
		p.setSexoBiologico("masculino");
		p.mostrarInformacoes();
	}

}
