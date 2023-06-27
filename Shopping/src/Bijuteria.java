package src;

public class Bijuteria extends Loja {
	public int metaVendas;
	public String nomeDoProduto;
	public String marca;

	public Bijuteria(String nomeDoProduto, int qtdFuncionarios, int SalarioBaseFuncionario, Endereco e1, Data d1,int i, int metaVendas) {
		super(nomeDoProduto,qtdFuncionarios,SalarioBaseFuncionario, e1, d1, metaVendas);
		this.nomeDoProduto = nomeDoProduto;
		this.qtdFuncionarios = qtdFuncionarios;
		this.SalarioBaseFuncionario = SalarioBaseFuncionario;
		this.metaVendas = metaVendas;
	}
	public String getMarca() {
		return marca;
	}
	public String setMarca(String marca) {
		 this.marca = marca;
		 return marca;
	}
	public int getMetaVendas() {
		return metaVendas;
	}
	public int setMetaVendas(int metaVendas) {
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


