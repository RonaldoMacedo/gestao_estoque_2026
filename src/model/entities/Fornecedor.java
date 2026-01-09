package model.entities;

public class Fornecedor {
	
	public Integer idFornecedor;
	public String razaoSocial;
	public String apelido;
	public String cnpj;
	
	public Fornecedor(Integer idFornecedor, String razaoSocial, String apelido, String cnpj) {
	
		this.idFornecedor = idFornecedor;
		this.razaoSocial = razaoSocial;
		this.apelido = apelido;
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Fornecedor [idFornecedor=" + idFornecedor + ", razaoSocial=" + razaoSocial + ", apelido=" + apelido
				+ ", cnpj=" + cnpj + "]";
	}
	
}
