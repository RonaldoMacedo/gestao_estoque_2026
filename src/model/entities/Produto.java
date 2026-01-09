package model.entities;

public class Produto {
	
	public Integer idProduto;
	public String descricaoInterna;
	public int quantidade;
	
	public Produto(Integer idProduto, String descricaoInterna, int quantidade) {

		this.idProduto = idProduto;
		this.descricaoInterna = descricaoInterna;
		this.quantidade = quantidade;
	}

	public void entrada(Integer quantidade) {
		this.quantidade += quantidade;
	}
	
	public void saida(Integer quantidade) {
		this.quantidade -= quantidade;
	}
	
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", descricaoInterna=" + descricaoInterna + ", quantidade="
				+ quantidade + "]";
	}

}
