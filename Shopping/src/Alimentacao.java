package src;

public class Alimentacao extends Loja {
	public Data dataAlvara;
public Alimentacao(String nome, Integer qtdFuncionarios, Double SalarioBaseFuncionario, Data dataAlvara) {
		super(nome, qtdFuncionarios, SalarioBaseFuncionario);
		this.dataAlvara = dataAlvara;
		// TODO Auto-generated constructor stub
	}

public Alimentacao(String nome, int qtdFuncionarios, int SalarioBaseFuncionario, Endereco e1, Data d1, Data d12, int k) {
	super(nome, qtdFuncionarios, SalarioBaseFuncionario, e1, d12, k);
}

public Data getDataAlvara() {
	return dataAlvara;
}
public Data setDataAlvara(Data dataAlvara) {
	this.dataAlvara = dataAlvara;
	return dataAlvara;
}
public String setNome(String nome) {
	this.nome = nome;
	return nome;
}
public String getNome() {
	return nome;
}
public Endereco setEndereco(Endereco endereco) {
	this.endereco = endereco;
	return endereco;
}
public Endereco getEndereco() {
	return endereco;
}
public String toString() {
	System.out.println("Tamanho da loja " + tamanhoDaLoja()+ "\n Salario Base:" + getSalarioBaseFuncionario() +" \n Gastos com salario:"+ gastosComSalario());
	System.out.println("Endereco é:" + getNome());
	System.out.println("Data do alvara:" + getDataAlvara());
	System.out.println("");
	return null;
	
}

}
