package dados;

public class Aluguel {
	private String dataAluguel;
	private String dataDevolucao;
	private Cliente cliente;
	private Carro carro;
	private Moto moto;
	private boolean isMoto = true;
	private boolean isCarro = true;
	public String getDataAluguel() {
		return dataAluguel;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Carro getCarro() {
		return carro;
	}
	public Moto getMoto() {
		return moto;
	}
	public boolean isMoto() {
		return isMoto;
	}
	public boolean isCarro() {
		return isCarro;
	}
	public void setDataAluguel(String dataAluguel) {
		this.dataAluguel = dataAluguel;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setCarro(Carro carro) {
		if(this.isCarro) {
			this.carro = carro;
			this.isMoto = false;
		}
	}
	public void setMoto(Moto moto) {
		if(this.isMoto) {
			this.moto = moto;
			this.isCarro = false;
		}
	}
	
	
	@Override
	public String toString() {
		return "Aluguel [dataAluguel=" + dataAluguel + ", dataDevolucao=" + dataDevolucao + ", cliente=" + cliente
				+ ", carro=" + carro + ", moto=" + moto + ", isMoto=" + isMoto + ", isCarro=" + isCarro + "]";
	}
	
	
	
}
