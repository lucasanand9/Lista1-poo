
public class Imovel {
	private double largura;
	private double comprimento;
	private double preco;
	private double area;
	
	
	public Imovel() {
		
	}
	
	public Imovel(double largura, double comprimento, double preco) {
		super();
		this.largura = largura;
		this.comprimento = comprimento;
		this.preco = preco;
		this.area = largura*comprimento;
	}
	
	public double getLargura() {
		return largura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public double getPreco() {
		return preco;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void calculaArea() {
		this.area = this.comprimento * this.largura;
	}
	public double getArea() { 
		return area;
	}
	
	@Override
	public String toString() {
		return "Imovel [largura=" + largura + ", comprimento=" + comprimento + ", preco=" + preco + ", area="+ area +"]";
	}
	
	
	
	
	
}
