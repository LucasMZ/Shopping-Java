package src;
public class Loja{
	public String nome;
	public int qtdFuncionarios;
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

	}
	public Loja(String nome,Integer qtdFuncionarios, Double SalarioBaseFuncionario, int j, Endereco e1, Data d1, int k ) {
        this.nome = nome;
        this.qtdFuncionarios = qtdFuncionarios;
        this.SalarioBaseFuncionario = -1.0; 
       
    }
	public int setQuantidadeFuncionarios(int qtdFuncionarios) {
		 this.qtdFuncionarios = qtdFuncionarios;
		 return qtdFuncionarios;
	}
	public int getQuantidadeFuncionarios() {
		 return qtdFuncionarios;
	}
	public Data data(Data dia, Data mes, Data ano,Data DataFundacao) {
		return data;
	}
	public Endereco GetEndereco() {
		return endereco;
	}
	/*
	public Endereco getEndereco() {
		return endereco;
	}
	/*
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	*/
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
			Produto produto = new Produto(nome, SalarioBaseFuncionario, nome, i, i);
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
	public double getSalarioBaseFuncionario() {
		return SalarioBaseFuncionario;
	}
	
	public void setSalarioBaseFuncionario(double SalarioBaseFuncionario) {
		this.SalarioBaseFuncionario = SalarioBaseFuncionario;
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
		System.out.println("Tamanho da loja " + tamanhoDaLoja()+ "\n Salario Base:" + getSalarioBaseFuncionario() +" \n Gastos com salario:"+ gastosComSalario());
		System.out.println("Endereco é:" + GetEndereco());
		System.out.println("Data de fundacao é:" + getDataFundacao());
		System.out.println("");
		return null;
		
	}
	public String setNome(String nome) {
		this.nome = nome;
		return nome;
		
	}
	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}
	
	
	
	
}
