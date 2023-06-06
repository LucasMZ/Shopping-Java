package src;
public class Loja{
	public String nome;
	public Integer qtdFuncionarios;
	public Double SalarioBaseFuncionario;
	public Data data;
	public Data DataFundacao;
	public Endereco endereco;
	public Integer i;
	public String[] estoqueProdutos;
	public Loja nomeDloja;
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//funcionario.SalarioBaseFuncionario = -1.0;
		Loja funcionario = new Loja(null, null, null);
		funcionario.imprimeProdutos();
		funcionario.setQtdFuncionario(4);
		funcionario.SalarioBaseFuncionario = 400.0;
		funcionario.getSalarioBase();
		funcionario.toString();
		
	}
	public Loja(String nome,Integer qtdFuncionarios, Double SalarioBaseFuncionario) {
        this.nome = nome;
        this.qtdFuncionarios = qtdFuncionarios;
        this.SalarioBaseFuncionario = SalarioBaseFuncionario;         
    }
	public Loja() {
		// TODO Auto-generated constructor stub
	}
	public int setQtdFuncionario(Integer qtdFuncionarios) {
		 this.qtdFuncionarios = qtdFuncionarios;
		 return qtdFuncionarios;
	}
	public Data data(Data dia, Data mes, Data ano,Data DataFundacao) {
		return data;
	}
	public Endereco GetEndereco(Endereco endereco) {
		return endereco;
	}
	public Endereco SetEndereco(Endereco endereco) {
		this.endereco = endereco;
		return endereco;
	}
	public Data getDataFundacao() {
		return data;
	}
	public Data SetDataFundacao(Data data) {
		this.data = data;
		return data;
	}
	public void imprimeProdutos() {
		getDataFundacao();
	}
	public boolean insereProduto() {
		for(i = 0; i < estoqueProdutos.length;i++) {
			Produto produto = new Produto();
			if(i == 0) {
				estoqueProdutos[i] = produto.nome;
				return true;
			}
		}
		return false;
	}
	public boolean removeProduto(String nome) {
		for(i = 0; i < estoqueProdutos.length;i++) {
			if(estoqueProdutos[i].contains(nome)) {
				estoqueProdutos[i] = null;
				return true;
			}
		}
		return false;
	}
	public Double getSalarioBase() {
		return SalarioBaseFuncionario;
	}
	public int set() {
		return 0;
	}
	public Double gastosComSalario(){
		if(qtdFuncionarios * SalarioBaseFuncionario > 0) {
			return qtdFuncionarios*SalarioBaseFuncionario;
		}else {
			return -1.0;
		}
	}
	public char tamanhoDaLoja() {
		char size;
		int qtd = this.qtdFuncionarios;
			if(qtd < 10) {
				size = 'P';
				return size;
			}if(qtd > 10 && qtd < 30) {
				 size = 'M';
				 return size;
			}if(qtd> 30) {
				size = 'G';
				return size;
			}
		return 0;
	}
	public String toString() {
		System.out.println("Tamanho da loja " + tamanhoDaLoja()+ "\n Salario Base:" + getSalarioBase() +" \n Gastos com salario:"+ gastosComSalario());
		System.out.println("Endereco é:" + GetEndereco(endereco));
		System.out.println("Data de fundacao é:" + getDataFundacao());
		System.out.println("");
		return null;
		
	}
}
