package src;

public class Produto {
public Double preco;
public String nome;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// falta criar os metodos toString
		
	}
	public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
       
    }
	public String GetNome() {
		return nome;
	}
	public Double GetPreco() {
		return preco;	
	}
	public String SetNome(String nome) {
		this.nome = nome;
		return nome;
	}
	public Double SetPreco(double preco) {
		this.preco = preco;
		return preco;
	}
}
