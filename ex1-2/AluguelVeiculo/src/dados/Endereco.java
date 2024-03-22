package dados;

public class Endereco {
	private String rua;
	private String bairro;
	private int numero;
	private String cidade;
	private String estado;
	private String cep;
	
	public String getRua() {
		return rua;
	}
	public String getBairro() {
		return bairro;
	}
	public int getNumero() {
		return numero;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public String getCep() {
		return cep;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {return true;}
		if(obj == null || getClass()!= obj.getClass()) {
			return false;
		}
		Endereco endereco = (Endereco) obj;
		if(endereco.getCep().equals(this.getCep()) && endereco.getNumero() == endereco.getNumero()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Endereço [rua=" + rua + ", bairro=" + bairro + ", numero=" + numero + ", cidade=" + cidade + ", estado="
				+ estado + ", cep=" + cep + "]";
	}
	

}
