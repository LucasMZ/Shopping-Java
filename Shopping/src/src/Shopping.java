package src;


/*



o quantidadeLojasPorTipo: este método recebe como parâmetro
uma String que indica o :po de loja que deve ser buscado (Cosmé:co,
Vestuário, Bijuteria, Alimentação ou Informá:ca). Deve-se então retornar
a quan:dade de lojas desse :po que existem no shopping. Caso seja
recebida uma String que não corresponde a nenhuma das opções
anteriores, o método retorna –1.
o lojaSeguroMaisCaro: este método não recebe parâmetros e retorna
a loja do :po Informatica que paga o maior valor de seguro de
eletrônicos do shopping. Caso não haja lojas deste :po, o método retorna
null.
 */
public class Shopping {
public String nome;
public Endereco endereco;
public Integer qtdLojas;
public Integer qtd;
public String[] lojas;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public Shopping(String nome, Endereco endereco,Integer qtdLojas, String[] lojas) {
		this.endereco = endereco;
		this.nome = nome;
		this.qtdLojas = qtdLojas;
		this.lojas = lojas;
		
	}
public String quantidadeLojasPorTipo() {
	return nome;
	
}
public String getNome() {
			return nome;
	}
public Endereco getEndereco() {
	return endereco;
}
	public boolean insereLoja(Object Loja) {
		for(var i = 0; i < lojas.length;i++) {
			Loja lojinha = new Loja();
			if(i == 0) {
				lojas[i] = lojinha.nome;
				return true;
			}
		}
		return false;
	}
	public boolean removeLoja() {
		for(var i = 0; i < lojas.length;i++) {
			if(lojas[i].equals(nome)) {
			lojas[i] = null;
			}
		}
		return false;
	}
	public String setNome(String nome) {
		this.nome = nome;
		return nome;
		
	}
	
	public void quantidadeLojasPorTipo(String tipo) {
		
		for(var i = 0; i < lojas.length;i++) {
			if(tipo.equalsIgnoreCase("Vestuario")){
				if(lojas[i] instanceof Vestuario) {
					qtd++;
				}
			}
				if(tipo.equalsIgnoreCase("Cosmetico")){
					if(lojas[i] instanceof Cosmetico) {
						qtd++;
					}
				}
					if(tipo.equalsIgnoreCase("Alimentacao")){
						if(Shopping.lojas[i] instanceof Alimentacao) {
							qtd++;
						}
					}
			}
		}
	}

	



