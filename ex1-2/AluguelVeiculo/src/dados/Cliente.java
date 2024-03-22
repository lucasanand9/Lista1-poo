package dados;

public class Cliente {
	private String nome;
	private String cpf;
	private Endereco endereco;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	//metodo equal:
	//https://www.dio.me/articles/equals-em-java-compreendendo-e-implementando-a-comparacao-de-objetos
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {return true;}
		if(obj == null || getClass()!= obj.getClass()) {
			return false;
		}
		Cliente cliente = (Cliente) obj;
		if(cliente.getCpf().equals(this.getCpf())) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", idade=" + idade + "]";
	}
	
	
	
}