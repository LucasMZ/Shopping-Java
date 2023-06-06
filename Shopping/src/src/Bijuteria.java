package src;

public class Bijuteria extends Loja {
	public Double metaVendas;
	public String nomeDoProduto;
	public String marca;

	public Bijuteria(String nomeDoProduto, String marca, Double taxaDeComercializacao, Integer qtdFuncionarios, String nome, Double SalarioBaseFuncionario, Double metaVendas) {
		super(nome, qtdFuncionarios, SalarioBaseFuncionario);
		this.marca = marca;
		this.nomeDoProduto = nomeDoProduto;
		this.metaVendas = metaVendas;
	}
	public String getMarca() {
		return marca;
	}
	public String setMarca(String marca) {
		 this.marca = marca;
		 return marca;
	}
	public Double getMetaVendas() {
		return metaVendas;
	}
	public Double setMetaVendas(Double metaVendas) {
		this.metaVendas = metaVendas;
		return metaVendas;
	}
	public String getNomeDoProduto(){
		return nomeDoProduto;
		
	}
		public String toString() {

		System.out.println("A Marca eh:" + getMarca());
		System.out.println("A Taxa eh:" + getMetaVendas());
		System.out.println("0 Produto eh:" + getNomeDoProduto());
		return marca;
		
	}

	}


