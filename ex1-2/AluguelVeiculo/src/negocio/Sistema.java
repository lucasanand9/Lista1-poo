package negocio;

import dados.Aluguel;
import dados.Carro;
import dados.Cliente;
import dados.Endereco;
import dados.Moto;

public class Sistema {

	public static void main(String[] args) {

		Carro carro1 = new Carro("MAU-2467");
		Carro carro2 = new Carro("MDE-6352");
		
		Endereco end1 = new Endereco();
		Endereco end2 = new Endereco();
		
		Cliente cli1 = new Cliente();
		Cliente cli2 = new Cliente();
		
		Moto moto1 = new Moto("MYF-7740");
		Moto moto2 = new Moto("IMZ-0521");
		
		Aluguel alu1 = new Aluguel();
		Aluguel alu2 = new Aluguel();
		
		carro1.setAno(2005);
		carro1.setMarca("Fiat");
		carro1.setModelo("Unu Mille");
		carro1.setCor("Vermelho");
		
		carro2.setAno(2017);
		carro2.setMarca("McLaren");
		carro2.setModelo("720s");
		carro2.setCor("Laranja");
		
		end1.setBairro("Agronomica");
		end1.setCep("88025500");
		end1.setCidade("Florianopolis");
		end1.setEstado("SC");
		end1.setNumero(313);
		end1.setRua("Rua delminda silveira");
		
		
		end2.setCep("88052600");
		end2.setBairro("Vargem Grande");
		end2.setCidade("Florianopolis");
		end2.setEstado("SC");
		end2.setNumero(1081);
		end2.setRua("Estrada machado de campos");
		
		cli1.setCpf("01401019935");
		cli1.setEndereco(end2);
		cli1.setIdade(18);
		cli1.setNome("Lucas Anand");
		
		cli2.setCpf("01019903514");
		cli2.setEndereco(end1);
		cli2.setIdade(81);
		cli2.setNome("Matheus");
		
		moto1.setAno(2024);
		moto1.setMarca("Honda");
		moto1.setModelo("Bis");
		moto1.setCor("Bege");
		
		moto2.setAno(2014);
		moto2.setModelo("Factor");
		moto2.setMarca("yamaha");
		moto2.setCor("Verde");
		
		alu1.setCarro(carro1);
		alu1.setCliente(cli2);
		alu1.setDataAluguel("20/03/2024");
		alu1.setDataDevolucao("24/03/2024");
		
		alu2.setMoto(moto2);
		alu2.setCliente(cli1);
		alu2.setDataAluguel("22/03/2024");
		alu2.setDataDevolucao("22/04/2024");
		
		System.out.println(cli1.toString());
		System.out.println(cli2.toString());
		
		System.out.println(alu1.toString());
		System.out.println(alu2.toString());
		
		System.out.println(moto1.toString());
		System.out.println(carro2.toString());
		

	}
}
