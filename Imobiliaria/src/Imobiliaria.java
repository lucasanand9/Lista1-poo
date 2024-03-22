import java.util.ArrayList;

public class Imobiliaria {
	private String nome;
	private ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
	
	
	
	public Imobiliaria(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Imovel> getImoveis() {
		return imoveis;
	}
	public void setImovel(Imovel imovel) {
		imoveis.add(imovel);
	}
	
	public ArrayList<Imovel> buscaImovelArea(double x){
		ArrayList<Imovel> filtro = new ArrayList<Imovel>();
		for(int i = 0; i < imoveis.size(); i++) {
			if(imoveis.get(i).getArea() >= x) {
				filtro.add(imoveis.get(i));
			}
		}
		Imovel aux = new Imovel();
		aux = filtro.get(0);
		for(int i = 0; i < filtro.size(); i++) {
			for(int j = 0; j < filtro.size(); j++) {
				if(aux.getPreco() > filtro.get(i).getPreco()) {
					aux = filtro.get(i);
					filtro.set(i, filtro.get(j));
					filtro.set(j, aux);
				}
			}
		}
		return filtro; 
	}
	
	@Override
	public String toString() {
		return "Imobiliaria [nome=" + nome + ", imoveis=" + imoveis + "]";
	}
	
	
	
}