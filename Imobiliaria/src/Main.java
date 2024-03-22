
public class Main {
	public static void main(String[] args) {
		Imovel a = new Imovel(2.0,4.0, 2000);
		Imovel b = new Imovel(4,3,1000);
		Imovel c = new Imovel(1,4,1000);
		
		a.getArea();
		b.getArea();
		c.getArea();
		
		Imobiliaria imob = new Imobiliaria("imobiliaria");
		imob.setImovel(a);
		imob.setImovel(b);
		imob.setImovel(c);
		
		System.out.println(imob.buscaImovelArea(5)); 
	}
}
