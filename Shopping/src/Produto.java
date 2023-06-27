package src;
public class Produto {
public Double preco;
public String nome;
public double dia;
public double ano;
public double mes;

public double dia2;
public double ano2;
public double mes2;
public Integer i;
public int DataValidade;



	
	public Produto(String nome, double preco, Data dia, Data mes, Data ano) {
        this.nome = nome;
        this.preco = preco;      
    }
	
	public Produto(double dia3, double mes3,double ano3) {
		// TODO Auto-generated constructor stub
	}

	public Produto(String nome2, Double salarioBaseFuncionario) {
		// TODO Auto-generated constructor stub
	}

	public Produto(String nome, int preco, Data data) {
		// TODO Auto-generated constructor stub
	}
	public Produto(String nome2) {
		// TODO Auto-generated constructor stub
	}

	public Produto(String nome2, int j, int k) {
		// TODO Auto-generated constructor stub
	}

	public boolean estaVencido(Data data) {
		if(this.dia > this.dia2) {
			if(this.mes > this.mes2) {
				if(this.ano > this.ano2) {
					return true;
				}
			}
			}
		return false;
	}
	 
	public String toString() {
		 Produto produto = new Produto(dia,mes,ano); 	 
		produto.getDataValidade();
		System.out.println(produto.getAno());
		System.out.println(produto.estaVencido(null));
		return produto.getNome();
	}
	public double getDia() {
		return dia;
	}
	public double getAno() {
		return ano;
	}
	public double getMes() {
		return mes;
	}
	//setters
	public double setDia(double dia) {
		this.dia = dia;
		return dia;
	}
	public double setAno(double mes) {
		this.ano = mes;
		return mes;
	}
	public double setMes(double mes) {
		this.mes = mes;
		return mes;
	}
	public String getNome() {
		return nome;
	}
	public Double getPreco() {
		return preco;	
	}
	public String setNome(String nome) {
		this.nome = nome;
		return nome;
	}
	public Double setPreco(double preco) {
		this.preco = preco;
		return preco;
	}
	public void setDataValidade( Data data) {
		ano2 = this.ano;
		mes2 = this.mes;
		dia2 = this.dia;
		
	}
	public double getDataValidade() {
		return ano2+dia2+mes2;
	
	}

	
	
	
	
}