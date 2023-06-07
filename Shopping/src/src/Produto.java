package src;
public class Produto {
public Double preco;
public String nome;
public String dia;
public int ano;
public String mes;
private int ano2;
public int mes2;
public Integer i;

	
	public Produto(String nome, Double preco, String mes, int ano, int ano2) {
        this.nome = nome;
        this.preco = preco;
        this.mes = mes;
        this.ano = ano;
       this.ano2 = ano2;
    }
	public Produto(String string, int j, Data d1) {
		// TODO Auto-generated constructor stub
	}
	public boolean estaVencido(Data data) {
			if(this.getAno() > this.getDataValidade(ano2)) {
				return true;
			}
		return false;
	}
	public String toString() {
		 Produto produto = new Produto(dia, preco, dia, ano, ano);
		produto.getDataValidade(ano2);
		System.out.println(produto.getAno());
		System.out.println(produto.estaVencido(null));
		return produto.getNome();
	}
	public int getDataValidade(int ano2) {
		return ano2;
	}
	public int setDataValidade(Data DataValidade) {
		this.ano2 = ano2;
		return ano2;
	}
	public String getDia() {
		return dia;
	}
	public int getAno() {
		return ano;
	}
	public String getMes() {
		return mes;
	}
	//setters
	public String setDia(String dia) {
		this.dia = dia;
		return dia;
	}
	public int setAno(int ano) {
		this.ano = ano;
		return ano;
	}
	public String setMes(String mes) {
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
}