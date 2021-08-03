package ATVD2;
import java.math.BigDecimal;

public class Produto {
	private int id;
	private String nome;
	private BigDecimal preco;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public BigDecimal getPreco() {
		return preco;
	}

}
