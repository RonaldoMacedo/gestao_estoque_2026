package model.entities;

public class Fornecedor {
	
	public Integer idFornecedor;
	public String razaoSocial;
	public String apelido;
	public String cnpj;
	
	@Override
	public String toString() {
		return "Fornecedor [idFornecedor=" + idFornecedor + ", razaoSocial=" + razaoSocial + ", apelido=" + apelido
				+ ", cnpj=" + cnpj + "]";
	}
	
}
