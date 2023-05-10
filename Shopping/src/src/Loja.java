package src;
public class Loja {
	public String nome;
	public Integer qtdFuncionarios;
	public Double SalarioBaseFuncionario;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//funcionario.SalarioBaseFuncionario = -1.0;
		Loja funcionario = new Loja();
		funcionario.qtdFuncionarios = 40;
		funcionario.SalarioBaseFuncionario = 400.0;
		funcionario.GetSalarioBase();
		System.out.println(funcionario.TamanhoDaLoja());
		System.out.println("salario base eh " + funcionario.GetSalarioBase());
		System.out.println("os gastos com salario são " + funcionario.GastosComSalario());
	}
	public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Integer qtdFuncionarios) {
        this.nome = nome;
        this.qtdFuncionarios = qtdFuncionarios;
        this.SalarioBaseFuncionario = salarioBaseFuncionario;
       
    }
	
	// falta criar os metodos toString
	public Loja() {
		// TODO Auto-generated constructor stub
	}
	public Double GetSalarioBase() {
		return SalarioBaseFuncionario;
	}
	public int set() {
		return 0;
	}
	public String ToString() {
		return "";
	}
	public Double GastosComSalario(){
		if(qtdFuncionarios * SalarioBaseFuncionario > 0) {
			
			return qtdFuncionarios*SalarioBaseFuncionario;
		}else {
			return -1.0;
		}
	}
	public char TamanhoDaLoja() {
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
}
