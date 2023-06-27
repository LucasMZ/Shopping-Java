package src;

public class Data {
public Integer dia;
public Integer ano;
public Integer mes;
public Integer DataVencimento;
	
	// TODO Auto-generated constructor stub

	
	public Data(Integer dia, Integer mes, Integer ano,Integer DataVencimento) {
		this.dia = dia;
		this.ano = ano;
		this.mes = mes;
		this.DataVencimento = DataVencimento;
}
	public Data(int ano, int dia, int mes) {
		// TODO Auto-generated constructor stub
	}
	public boolean verificaAnoBissexto(Integer ano) {
		ano = this.getAno();
		if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println(ano + " é bissexto.");
            return true;
        } else {
            System.out.println(ano + " não é bissexto.");
            return false;
        }
	}
	
	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
	public Integer getDia() {
		return dia;
	}
	public Integer getAno() {
		return ano;
	}
	public Integer getMes() {
		return mes;
	}
	//setters
	public Integer setDia(int dia) {
		this.dia = dia;
		return dia;
	}
	public int setAno(Integer ano) {
		this.ano = ano;
		return ano;
	}
	public Integer setMes(Integer mes) {
		this.mes = mes;
		return mes;
	}
	public int setDataVencimento(int DataVencimento) {
		this.DataVencimento = DataVencimento;
		return DataVencimento;	
		}
		
}
