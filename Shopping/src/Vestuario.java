package src;
/*
 Crie uma classe chamada Vestuario, que é um tipo de loja, representando
uma loja de vestuário. As lojas de vestuários possuem como atributo (além de
tudo que uma Loja tem) um valor booleano chamado
produtosImportados. Este atributo indica se a loja de vestuário vende
roupas importadas ou não. Crie um construtor para a classe, que receba
informações para inicializar todos os atributos. Além disso, crie os métodos de
acesso dos atributos (os métodos que ainda não existem) e sobrescreva o
método toString, incluindo a informação específica da classe.
 */
public class Vestuario extends Loja {
		private Boolean produtosImportados;

	public Vestuario(String nome,int qtdFuncionarios, int SalarioBaseFuncionario, Endereco e1, Data d1, boolean produtosImportados, int k ) {
			super(nome, qtdFuncionarios, SalarioBaseFuncionario, e1, d1, produtosImportados);
			setProdutosImportados(produtosImportados);	
	}
	
	public Boolean getProdutosImportados() {
		return produtosImportados;	
	}
	public Boolean setProdutosImportados(Boolean produtosImportados) {
		this.produtosImportados = produtosImportados;
		return produtosImportados;	
	}
	public String getNome() {
		return nome;
	}
	public String setNome(String nome) {
		this.nome = nome;
		return nome;
	}
	public double getSalarioBaseFuncionario() {
		return SalarioBaseFuncionario;
	}
	
	public void setSalarioBaseFuncionario(int SalarioBaseFuncionario) {
		this.SalarioBaseFuncionario = SalarioBaseFuncionario;
	}
	
	public String toString() {
		System.out.println("essa loja vende importados" + getProdutosImportados());
		return null;
	}
}
