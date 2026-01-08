package model.entities;

public class Item {
	
	public Integer idItem;
	public String descricao;
	public String codigoREF;
	public String codigoBarras;
	public int quantidade;
	
	public void entrada(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void saida(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		return "Item [idItem=" + idItem + ", descricao=" + descricao + ", codigoREF=" + codigoREF + ", codigoBarras="
				+ codigoBarras + ", quantidade=" + quantidade + "]";
	}

}
