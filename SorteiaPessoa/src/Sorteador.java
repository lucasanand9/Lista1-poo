import java.util.ArrayList;
import java.util.Random;

public class Sorteador {
	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	private static Random rnd = new Random();
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Lucas", "014.010.199-35", 18);
		Pessoa p2 = new Pessoa("Arthur", "359.910.104-10", 18);
		Pessoa p3 = new Pessoa("Clara", "194.368.558-42", 16);
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		System.out.println("Pessoas: " + pessoas);
		System.out.println("Pessoa sorteada: " + sortearProximo());
		System.out.println("Pessoas: " + pessoas);
		
	}
	
	public static Pessoa sortearProximo() {
		int sortear = rnd.nextInt(pessoas.size());
		Pessoa aux = pessoas.get(sortear);
		pessoas.remove(sortear);
		return aux;
	}
}
