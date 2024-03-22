package dados;

public class Carro {
	private String placa;
	private String cor;
	private String modelo;
	private String marca;
	private int ano;
	
	
	
	public Carro(String placa) {
		this.placa = placa;
	}
	public String getPlaca() {
		return placa;
	}
	public String getCor() {
		return cor;
	}
	public String getModelo() {
		return modelo;
	}
	public String getMarca() {
		return marca;
	}
	public int getAno() {
		return ano;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {return true;}
		if(obj == null || getClass()!= obj.getClass()) {
			return false;
		}
		Carro carro = (Carro) obj;
		if(carro.getPlaca().equals(this.getPlaca())) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", cor=" + cor + ", modelo=" + modelo + ", marca=" + marca + ", ano=" + ano
				+ "]";
	}
	
	
}
