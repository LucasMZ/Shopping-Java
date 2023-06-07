package src;

public class Cosmetico extends Loja {
public Double taxaDeComercializacao;
public String nomeDoProduto;
public String marca;

public Cosmetico(String nomeDoProduto, String marca, Double taxaDeComercializacao, Integer qtdFuncionarios, String nome, Double SalarioBaseFuncionario) {
	super(nome, qtdFuncionarios, SalarioBaseFuncionario);
	this.marca = marca;
	this.nomeDoProduto = nomeDoProduto;
	this.taxaDeComercializacao = taxaDeComercializacao;
}

public String getMarca() {
	return marca;
}
public String setMarca(String marca) {
	 this.marca = marca;
	 return marca;
}
public Double getTaxa() {
	return taxaDeComercializacao;
}
public Double setTaxa(Double taxaDeComercializacao) {
	this.taxaDeComercializacao = taxaDeComercializacao;
	return taxaDeComercializacao;
}
public String getNomeDoProduto(){
	return nomeDoProduto;
	
}
	public String toString() {

	System.out.println("A Marca eh:" + getMarca());
	System.out.println("A Taxa eh:" + getTaxa());
	System.out.println("0 Produto eh:" + getNomeDoProduto());
	return marca;
	
}

}
