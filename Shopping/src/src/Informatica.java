package src;

public class Informatica extends Loja {
	public Double seguroEletronicos;
	public Informatica(String nome, Integer qtdFuncionarios, Double SalarioBaseFuncionario, Double seguroEletronicos) {
			super(nome, qtdFuncionarios, SalarioBaseFuncionario);
			this.seguroEletronicos = seguroEletronicos;
			// TODO Auto-generated constructor stub
		}
	public Double getSeguro() {
		return seguroEletronicos;
	}
	public Double setSeguro(Double seguroEletronicos) {
		this.seguroEletronicos = seguroEletronicos;
		return seguroEletronicos;
	}
	public String toString() {
		System.out.println("Tamanho da loja " + tamanhoDaLoja()+ "\n Salario Base:" + getSalarioBase() +" \n Gastos com salario:"+ gastosComSalario());
		System.out.println("Endereco é:" + GetEndereco(endereco));
		System.out.println("Data do alvara:" + getSeguro());
		System.out.println("");
		return null;
}
}
