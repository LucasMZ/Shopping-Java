package src;

import java.util.ArrayList;

/*
 No construtor de Shopping, receba informações para
inicializar o nome, o endereço e, também, receba a quan:dade máxima de lojas
deste shopping (do :po inteiro). No construtor de shopping, então, instancie o
array lojas, informando a capacidade dele de acordo com o valor recebido por
parâmetro. Naturalmente, quando um Shopping for criado, ele não terá lojas
ainda, apenas o espaço em memória necessário para armazená-las. Crie os
métodos de acesso dos atributos. Implemente o método toString nesta
classe, retornando uma String formatada da forma que você desejar, desde
que contenha as informações de todos os atributos da classe.
• Na classe Shopping, crie os seguintes métodos:
o insereLoja: este método recebe um objeto do :po Loja por
parâmetro e insere esta loja no array lojas, na primeira posição livre do
array (ou seja, a primeira posição nula). O método retorna verdadeiro caso
a loja seja inserida corretamente e falso caso contrário (ou seja, caso não
haja lugar no array).
o removeLoja: este método recebe uma String que representa o nome
de uma loja e remove a loja com este nome do array lojas. O método
retorna verdadeiro caso a loja seja removida e falso caso contrário (caso
não haja a loja com o nome solicitado no array).
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
ArrayList<Loja> lojas = new ArrayList<Loja>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	public Shopping(String nome, ArrayList<Loja> lojas, Endereco endereco,Integer qtdLojas) {
		this.endereco = endereco;
		this.nome = nome;
		this.lojas = lojas;
		this.qtdLojas = qtdLojas;
	}
	public void insereLoja(String nome) {
		Loja loja = new Loja();
		loja.nome = "zeca bijuteria";
		var nomeDLoja = loja.nome;
		lojas.add(loja.nomeDloja);
	}
	public void removeLoja(Object loja) {
		if(lojas.contains(nome)) {
			lojas.get(1);
		}
	}

}
