package src;

public class Alimentacao extends Loja {
	public Data dataAlvara;
public Alimentacao(String nome, Integer qtdFuncionarios, Double SalarioBaseFuncionario, Data dataAlvara) {
		super(nome, qtdFuncionarios, SalarioBaseFuncionario);
		this.dataAlvara = dataAlvara;
		// TODO Auto-generated constructor stub
	}
public Data getAlvara() {
	return dataAlvara;
}
public Data setAlvara(Data dataAlvara) {
	this.dataAlvara = dataAlvara;
	return dataAlvara;
}
public String toString() {
	System.out.println("Tamanho da loja " + tamanhoDaLoja()+ "\n Salario Base:" + getSalarioBase() +" \n Gastos com salario:"+ gastosComSalario());
	System.out.println("Endereco é:" + GetEndereco(endereco));
	System.out.println("Data do alvara:" + getAlvara());
	System.out.println("");
	return null;
	
}

}
