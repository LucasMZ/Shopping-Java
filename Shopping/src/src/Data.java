package src;

public class Data {
public Integer dia;
public Integer ano;
public Integer mes;
	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
		Data data = new Data(13,06,2008);
		
			data.verificaBissexto(data.setAno(2012));
	}
	public void verificaBissexto(Integer ano) {
		ano = this.getAno();
		if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }
		

		
	}
	public Data(Integer dia, Integer mes, Integer ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public int getDia() {
		return dia;
	}
	public int getAno() {
		return mes;
	}
	public int getMes() {
		return mes;
	}
	//setters
	public int setDia(Integer dia) {
		this.dia = dia;
		return dia;
	}
	public int setAno(Integer ano) {
		this.mes = ano;
		return ano;
	}
	public int setMes(Integer mes) {
		this.mes = mes;
		return mes;
	}
}
