package model.entities;

public class Produto {
	
	public Integer idProduto;
	public String descricaoInterna;
	
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", descricaoInterna=" + descricaoInterna + "]";
	}

}
