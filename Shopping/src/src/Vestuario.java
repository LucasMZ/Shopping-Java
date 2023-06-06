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
public Boolean produtosImportados;

	public Vestuario(String nome, Integer qtdFuncionarios, Double SalarioBaseFuncionario, Boolean produtosImportados) {
		super(nome, qtdFuncionarios, SalarioBaseFuncionario);
		this.produtosImportados = produtosImportados;
		// TODO Auto-generated constructor stub
	}
	public Boolean getImportados() {
		return produtosImportados;	
	}
	public Boolean setImportados(Boolean produtosImportados) {
		this.produtosImportados = produtosImportados;
		return produtosImportados;	
	}
	public String toString() {
		System.out.println("essa loja vende importados" + getImportados());
		return null;
	}
}
