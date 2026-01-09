package model.entities;

public class Item {
	
	public Integer idItem;
	public String descricao;
	public String codigoREF;
	public String codigoBarras;
	public int quantidade;
	
	public Item(Integer idItem, String descricao, String codigoREF, String codigoBarras, int quantidade) {
		this.idItem = idItem;
		this.descricao = descricao;
		this.codigoREF = codigoREF;
		this.codigoBarras = codigoBarras;
		this.quantidade = quantidade;
	}
	
	public Item(Integer idItem, String descricao, String codigoREF, String codigoBarras) {
		this.idItem = idItem;
		this.descricao = descricao;
		this.codigoREF = codigoREF;
		this.codigoBarras = codigoBarras;
	}

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
