package src;

public class Data {
public String dia;
public int ano;
public String mes;
public int DataVencimento;
	
	// TODO Auto-generated constructor stub

	
	public Data(String dia, String mes, int ano,int DataVencimento) {
		this.dia = dia;
		this.ano = ano;
		this.mes = mes;
		this.DataVencimento = DataVencimento;
}
	public Data() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
		Data data = new Data();
		System.out.println(data.toString());
		data.setDataVencimento(2023);
		data.setAno(2008);
		data.setMes("02");
		data.setDia("11");
		data.verificaBissexto(data.getAno());
	}
	public void verificaBissexto(Integer ano) {
		ano = this.getAno();
		if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }
	}
	
	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.ano;
		
	}
	public String getDia(String dia) {
		return dia;
	}
	public int getAno() {
		return ano;
	}
	public String getMes(String mes) {
		return mes;
	}
	//setters
	public String setDia(String dia) {
		this.dia = dia;
		return dia;
	}
	public int setAno(Integer ano) {
		this.ano = ano;
		return ano;
	}
	public String setMes(String mes) {
		this.mes = mes;
		return mes;
	}
	public boolean compareTo(Data dataValidade) {
		// TODO Auto-generated method stub
		return false;
	}

	public int setDataVencimento(int DataVencimento) {
		this.DataVencimento = DataVencimento;
		return DataVencimento;	
		}
	



	
}
