package Classes;

public class Cliente {
	
	private String nome;
	private String endereco;
	private String cidade;
	private String uf;
	private int id;
	private String telefone;
	private Carro carro;
	public Cliente(){
		
		
		
	}
	
	public Cliente(String nome, String endereco, String cidade, 
			String uf, int id, String telefone,Carro carro ){
	
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.uf = uf;
		this.telefone = telefone;
		this.carro = carro;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " " +
				"ID: " + this.id + "\n" +
				"Endereço: " + this.endereco + "\n" +
				"Cidade: " + this.cidade + " " +
				"UF: " + this.uf + "\n" +
				"Telefone: " + this.telefone + "\n" +
				"Carro: " + this.carro.getModelo() + " " +
				"Placa: " + this.carro.getPlaca() + "\n" ;
	}
	
	
}
