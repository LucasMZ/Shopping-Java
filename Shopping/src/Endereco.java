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

	public Endereco(String pais,String estado,String cidade, String cep,String nomeDaRua,String numero, String complemento ) {
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.numero = numero;
		this.nomeDaRua = nomeDaRua;
		this.complemento = complemento;
		
	}
	public Data data(Data dia, Data mes, Data ano,Data DataFundacao) {
		return data;
	}
	public Endereco GetEndereco() {
		return endereco;
	}
	public Endereco setEndereco(Endereco endereco) {
		this.endereco = endereco;
		return endereco;
	}
	public Data getDataFundacao(Data data) {
		return data;
	}
	public Data setDataFundacao(Data data) {
		this.data = data;
		return data;
	}
	
	// metodos getter
public String getCep() {
		return cep;
}
public String getCidade() {
		return cidade;
	}
public String getEstado() {
	return estado;
}
public String getPais() {
	return pais;
}
public String getComplemento() {
	return complemento;
}
public String getNomeDaRua() {
	return nomeDaRua;
}
public String getNumero() {
	return numero;
}
// métodos setter
public String setCep(String cep) {
	this.cep = cep;
	return cep;
}
public String setCidade(String cidade) {
	this.cidade = cidade;
	return cidade;
}
public String setEstado(String estado) {
	this.estado = estado;
return estado;
}
public String setPais(String pais) {
	this.pais = pais;
return pais;
}
public String setComplemento(String complemento) {
	this.complemento = complemento;
return complemento;
}
public String setNomeDaRua(String nomeDaRua) {
this.nomeDaRua = nomeDaRua;
return nomeDaRua;
}
public String setNumero(String numero) {
	this.numero = numero;
return numero;
}
public String toString() {
	System.out.println("pais:" + getPais());
	System.out.println("estado:" + getEstado());
	System.out.println("cidade:" + getCidade());
	System.out.println("cep:" + getCep());
	System.out.println("rua:" + getNomeDaRua());
	System.out.println("complemento:" + getComplemento());
	System.out.println("numero da rua:" + getNumero());
	return cep;
}
}

