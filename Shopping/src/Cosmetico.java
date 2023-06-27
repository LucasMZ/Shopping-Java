package src;

public class Cosmetico  {
public Double taxaDeComercializacao;
public String nomeDoProduto;
public String marca;



public Cosmetico(String string, int i, int j, Endereco e1, Data d1, int k, int l) {
	
}

public String getMarca() {
	return marca;
}
public String setMarca(String marca) {
	 this.marca = marca;
	 return marca;
}
public Double getTaxaComercializacao() {
	return taxaDeComercializacao;
}
public Double setTaxaComercializacao(int i) {
	this.taxaDeComercializacao = (double) i;
	return (double) i;
}
public String getNomeDoProduto(){
	return nomeDoProduto;
	
}
	public String toString() {

	System.out.println("A Marca eh:" + getMarca());
	System.out.println("A Taxa eh:" + getTaxaComercializacao());
	System.out.println("0 Produto eh:" + getNomeDoProduto());
	return marca;
	
}

}
