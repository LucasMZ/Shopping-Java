package src;


public class Endereco {
	public String nomeDaRua;
	public String cidade;
	public String estado;
	public String pais; 
	public String cep;
	public String numero;
	public String complemento;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// metodo construtor
	public Endereco(String nomeDaRua,String cidade, String estado, String pais, String cep, String numero,String complemento ) {
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.numero = numero;
		this.nomeDaRua = nomeDaRua;
		this.complemento = complemento;
	}
	// metodos getter
	public String GetCep() {
		return cep;
	}
public String GetCidade() {
		return cidade;
	}
public String GetEstado() {
	return estado;
}
public String GetPais() {
	return pais;
}
public String GetComplemento() {
	return complemento;
}
public String GetNomeDaRua() {
	return nomeDaRua;
}
public String GetNumero() {
	return numero;
}

// métodos setter
public String SetCep(String cep) {
	this.cep = cep;
	return cep;
}
public String SetCidade(String cidade) {
	this.cidade = cidade;
	return cidade;
}
public String SetEstado(String estado) {
	this.estado = estado;
return estado;
}
public String SetPais(String pais) {
	this.pais = pais;
return pais;
}
public String SetComplemento(String complemento) {
	this.complemento = complemento;
return complemento;
}
public String SetNomeDaRua(String nomeDaRua) {
this.nomeDaRua = nomeDaRua;
return nomeDaRua;
}
public String SetNumero(String numero) {
	this.numero = numero;
return numero;
}
// falta criar os metodos toString
}

