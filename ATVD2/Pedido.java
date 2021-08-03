package ATVD2;

import java.math.BigDecimal;
import java.util.List;
import java.time.LocalDateTime;

public class Pedido {
	private int id;
	private LocalDateTime dataPedido;
	private List<Produto> produtos;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(LocalDateTime dataPedido) {
		this.dataPedido = dataPedido;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public BigDecimal getValorPedido() {
		
		BigDecimal soma = new BigDecimal("0");
		int rep = 0;
		while(rep < getProdutos().size()){
			BigDecimal total = getProdutos().get(rep).getPreco();
			rep++;
			soma = soma.add(total);
		}
		return soma;
	}

}
