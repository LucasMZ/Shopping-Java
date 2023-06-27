package src;
public class Loja{
	public String nome;
	public int qtdFuncionarios;
	public int SalarioBaseFuncionario;
	public Data data;
	public Data DataFundacao;
	public Endereco endereco;
	public Produto[] estoqueProdutos;
	private Data DataAlvara;
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//funcionario.SalarioBaseFuncionario = -1.0;

	}
	public Loja(String nome,int qtdFuncionarios, int salarioBaseFuncionario, Endereco e1, Data d1, boolean produtosImportados ) {
        this.nome = nome;
        this.qtdFuncionarios = qtdFuncionarios;
        this.SalarioBaseFuncionario = -1;    
        this.endereco = e1;
        this.data = d1;    
    }
	public Loja(String nome,int qtdFuncionarios, int salarioBaseFuncionario, Endereco e1, Data d1,int i ) {

        this.nome = nome;
        this.qtdFuncionarios = qtdFuncionarios;
        this.SalarioBaseFuncionario = -1;    
        this.endereco = e1;
        this.data = d1;    
    }
	public Loja(String nome, Integer qtdFuncionarios, Double salarioBaseFuncionario2) {
		// TODO Auto-generated constructor stub
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
	public void SetEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public Data getDataFundacao() {
		return data;
	}
	public Data setDataFundacao(Data data) {
		this.data = data;
		return data;
	}
	public void imprimeProdutos() {
		System.out.println();
	}
	
	public boolean insereProduto(Produto produto) {
		if(this.estoqueProdutos[0] == null){
			this.estoqueProdutos[0] = produto;
			return true;
		}
		
		this.estoqueProdutos[1] = produto;
		return false;
	}
	public boolean removeProduto(String nome) {
		for(var i = 0; i < estoqueProdutos.length;i++) {
			if(nome.equals(estoqueProdutos[0])) {
				estoqueProdutos[i].nome = null;
				
				return true;
			}
		}
		return false;
	}
	public double getSalarioBaseFuncionario() {
		return SalarioBaseFuncionario;
	}
	
	public void setSalarioBaseFuncionario(int SalarioBaseFuncionario) {
		this.SalarioBaseFuncionario = SalarioBaseFuncionario;
	}
	public int set() {
		return 0;
	}
	public int gastosComSalario(){
		if(this.qtdFuncionarios * this.SalarioBaseFuncionario > 0) {
			int x = this.qtdFuncionarios*this.SalarioBaseFuncionario;
			return x;
		}else {
			return -1;
		}
	}
	public char tamanhoDaLoja() {
		char tam = 4;
		if(qtdFuncionarios < 10) {
			return tam = 'P';
		}else if(qtdFuncionarios > 10 && qtdFuncionarios < 30) {
			return tam = 'M';
			
		}else if(qtdFuncionarios > 31) {
			return tam = 'G';
		}
		return tam;
	}
	public String toString() {
		System.out.println("Tamanho da loja " + tamanhoDaLoja()+ "\n Salario Base:" + getSalarioBaseFuncionario() +" \n Gastos com salario:"+ gastosComSalario());
		System.out.println("Endereco é:" + getEndereco());
		System.out.println("Data de fundacao é:" + getDataFundacao());
		System.out.println("estoque;" + getEstoqueProdutos());
		return "";
	}
	public String setNome(String nome) {
		this.nome = nome;
		return nome;
	}
	public String getNome() {
		return nome;
	}

	public void setEstoqueProdutos(Produto[] estoqueProdutos) {
	    this.estoqueProdutos = estoqueProdutos;
	}
	public Produto[] getEstoqueProdutos() {
	    if (estoqueProdutos == null) {
	        return new Produto[1]; // Retorna um array vazio se estoqueProdutos for nulo
	    }
	    return estoqueProdutos;
	}
	public Endereco setEndereco(Endereco endereco) {
		this.endereco = endereco;
		return endereco;
		
	}
	public void setDataFundacao(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}
	public Data setDataAlvara(Data DataAlvara) {
		this.DataAlvara = DataAlvara;
		return DataAlvara;
		
	}
	public Data getDataAlvara() {
		return DataAlvara;
		// TODO Auto-generated method stub
		
	}
	
}

