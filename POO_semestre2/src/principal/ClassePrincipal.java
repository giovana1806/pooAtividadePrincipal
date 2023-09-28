package principal;

import principal.cliente.Cliente1;
import principal.cliente.Cliente2;
import principal.endereco.Endereco1;
import principal.endereco.Endereco2;
import principal.itemTema.ItemTema1;
import principal.itemTema.ItemTema2;
import principal.tema.Tema1;
import principal.tema.Tema2;

public class ClassePrincipal {

	public static void main(String[] args) {
		Tema1 tema01 = new Tema1();
		tema01.setCorToalha("rosa");
		tema01.setId(5);
		tema01.setNome("Giovana");
		tema01.setValorAluguel(55.99);
		System.out.println(tema01.getCorToalha());
		System.out.println(tema01.getId());
		System.out.println(tema01.getNome());
		System.out.println(tema01.getValorAluguel());
		
		Tema2 tema02 = new Tema2(5,"Giovana",55.99,"azul");		
		System.out.println(tema02.getCorToalha());
		System.out.println(tema02.getId());
		System.out.println(tema02.getNome());
		System.out.println(tema02.getValorAluguel());
		
		Cliente1 cliente01 = new Cliente1();
		cliente01.setCpf("123.456.789-0");
		cliente01.setId(01);
		cliente01.setNome("Giovana");
		cliente01.setRg("12.345.6789-0");
		cliente01.setTelefone("15 99123-4567");
		System.out.println(cliente01.getCpf());
		System.out.println(cliente01.getId());
		System.out.println(cliente01.getNome());
		System.out.println(cliente01.getRg());
		System.out.println(cliente01.getTelefone());
		
		Cliente2 cliente02 = new Cliente2(1,"Giovana","15 99123-4567","123.456.789-0","123.4567.7890-0");
		System.out.println(cliente02.getCpf());
		System.out.println(cliente02.getId());
		System.out.println(cliente02.getNome());
		System.out.println(cliente02.getRg());
		System.out.println(cliente02.getTelefone());
		
		ItemTema1 item1 = new ItemTema1();
		item1.setDescricao("Tema complicado e feito em 10 dias");
		item1.setId(5);
		item1.setNome("filme curtametragem");
		System.out.println(item1.getDescricao());
		System.out.println(item1.getId());
		System.out.println(item1.getNome());
		
		ItemTema2 item2 = new ItemTema2(5, "filme curtametragem","Tema complicado e feito em 10 dias");
		System.out.println(item2.getDescricao());
		System.out.println(item2.getId());
		System.out.println(item2.getNome());
		
		Endereco1 endereco01 = new Endereco1();
		endereco01.setId(5);
		endereco01.setLogradouro("aaaaaaaa");
		endereco01.setNumero(15);
		endereco01.setComplemento("proximo a igreja");
		endereco01.setBairro("rio branco");
		endereco01.setCidade("Itapetininga");
		endereco01.setCep("12345-980");
		endereco01.setUf("ooooo");
		System.out.println(endereco01.getBairro());
		System.out.println(endereco01.getCep());
		System.out.println(endereco01.getCidade());
		System.out.println(endereco01.getComplemento());
		System.out.println(endereco01.getId());
		System.out.println(endereco01.getLogradouro());
		System.out.println(endereco01.getNumero());
		System.out.println(endereco01.getUf());
				
		Endereco2 endereco02 = new Endereco2(5,"aaaaaaaa",15,"proximo a igreja","rio branco","Itapetininga","12345-980","ooooo");
		System.out.println(endereco02.getBairro());
		System.out.println(endereco02.getCep());
		System.out.println(endereco02.getCidade());
		System.out.println(endereco02.getComplemento());
		System.out.println(endereco02.getId());
		System.out.println(endereco02.getLogradouro());
		System.out.println(endereco02.getNumero());
		System.out.println(endereco02.getUf());
	}

}
