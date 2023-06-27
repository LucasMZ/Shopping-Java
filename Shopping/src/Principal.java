package src;

import java.util.Scanner;

public class Principal {
public int val;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("(1)| Criar uma Loja   |");
		System.out.println("(2)| Criar Um Produto |");
		System.out.println("(3)| voltar	      |");
		System.out.println("(4)| Sair	      |");
		Scanner ler = new Scanner(System.in);
		String ler2 = ler.nextLine();
	
			System.out.println("(1)| Criar uma Loja   |");
			System.out.println("de qual tipo vc qr criar a loja:");
			ler2 = ler.nextLine();
			switch(ler2.toLowerCase()){
			case "bijuteria":
				Loja loja1 = new Loja(null, null, null);
				loja1.setNome("Loja 1");
				loja1.setSalarioBaseFuncionario(2000);
				loja1.setQuantidadeFuncionarios(3);
				loja1.setEndereco(null);
				loja1.setDataFundacao(10,10,2008);
				loja1.toString();			
				loja1.getEstoqueProdutos();
				
				break;
			case "alimentacao":
				Loja loja2 = new Loja(null, null, null);
				loja2.setNome("Loja 2");
				loja2.setSalarioBaseFuncionario(2000);
				loja2.setQuantidadeFuncionarios(3);
				loja2.setEndereco(null);
				loja2.setDataFundacao(10,10,2008);
				loja2.toString();
				loja2.setEstoqueProdutos(new Produto[0]);
				loja2.setDataAlvara(null);
				
				
				break;
			case "informatica":
				Loja loja3 = new Loja(null, null, null);
				Informatica info = new Informatica(null, null, null, null);
				loja3.setNome("Loja 3");
				loja3.setSalarioBaseFuncionario(2000);
				loja3.setQuantidadeFuncionarios(3);
				loja3.setEndereco(null);
				loja3.setDataFundacao(10,10,2008);
				loja3.toString();
				info.setSeguro(3000.4);
				loja3.setEstoqueProdutos(new Produto[0]);
				break;
			case "vestuario":
				Loja loja4 = new Loja(null, null, null);
				Vestuario vest = new Vestuario("", 0, 0, null, null, true, 0);
				loja4.setNome("Loja 4");
				loja4.setSalarioBaseFuncionario(2000);
				loja4.setQuantidadeFuncionarios(3);
				loja4.setEndereco(null);
				loja4.setDataFundacao(10,10,2008);
				loja4.toString();
				loja4.setEstoqueProdutos(new Produto[0]);
				vest.setProdutosImportados(true);
				vest.toString();
				break;
			}
			
			ler2 = ler.nextLine();
			switch(ler2.toLowerCase()){
			case "2":
			Produto produto1 = new Produto(null, null);
		    produto1.setPreco(20.0);
		    
		    produto1.setDataValidade(null);
		    produto1.setNome("Produto XYZ123");
		    System.out.println("Produto criada com o nome: " + produto1.getNome());
		    System.out.println("o preço do é Produto : R$" + produto1.getPreco());	
			
			}
			Endereco e1 = new Endereco("Brasil", "RS", "Triunfo", "95840-000", "Lobo simão", "11", "ginasio");
			e1.toString();
			
			
		    
			

		
	}

}

