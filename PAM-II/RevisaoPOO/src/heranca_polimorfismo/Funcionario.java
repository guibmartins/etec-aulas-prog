package heranca_polimorfismo;

public class Funcionario extends Pessoa {
	
	private int id_clt_pj;
	private String data_admissao;
	private String data_desligamento;
	private String funcao;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(int id_clt_pj, String data_admissao) {
		super();
		this.setId_clt_pj(id_clt_pj);
		this.setData_admissao(data_admissao);
	}
	
	public Funcionario(String nome, String data_nasc, String sexo, int id_clt_pj, String data_admissao) {
		super(nome, data_nasc, sexo);
		this.setId_clt_pj(id_clt_pj);
		this.setData_admissao(data_admissao);
	}

	public int getId_clt_pj() {
		return id_clt_pj;
	}

	public void setId_clt_pj(int id_clt_pj) {
		this.id_clt_pj = id_clt_pj;
	}

	public String getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(String data_admissao) {
		this.data_admissao = data_admissao;
	}

	public String getData_desligamento() {
		return data_desligamento;
	}

	public void setData_desligamento(String data_desligamento) {
		this.data_desligamento = data_desligamento;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public void MostrarDados() {
		
		System.out.println("Num.Registro: "+ this.id_clt_pj);
		System.out.println("Data de admissão: " + this.data_admissao);
		System.out.println("Função/cargo: " + this.funcao);
		
		if (this.data_desligamento != null || this.data_desligamento != "") {
			System.out.println("Data de desligamento: " + this.data_desligamento);
		}
		
	}
}
