package src;
public class Endereco {
	public String nomeDaRua;
	public String cidade;
	public String estado;
	public String pais; 
	public String cep;
	public String numero;
	public Endereco endereco;
	public String complemento;
	public Data data;
	public Data DataFundacao;

	public Data data(Data dia, Data mes, Data ano,Data DataFundacao) {
		return data;
	}
	public Endereco getEndereco(Endereco endereco) {
		return endereco;
	}
	public Endereco setEndereco(Endereco endereco) {
		this.endereco = endereco;
		return endereco;
	}
	public Data GetDataFundacao(Data data) {
		return data;
	}
	public Data SetDataFundacao(Data data) {
		this.data = data;
		return data;
	}
	// metodo construtor
	public Endereco(String cep, String cidade, String estado, String numero, String pais, String nomeDaRua, String complemento ) {
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

