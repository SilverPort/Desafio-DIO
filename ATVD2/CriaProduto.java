package ATVD2;

import java.math.BigDecimal;

public class CriaProduto {
	public static void main(String[] args) {
		Produto produto = new Produto();
		BigDecimal preco = new BigDecimal("12.34");
		
		produto.setId(1);
		System.out.println("ID: " + produto.getId());
		
		produto.setNome("Arroz");
		System.out.println("PRODUTO: " + produto.getNome());
		
		produto.setPreco(preco);
		System.out.println("PREÇO: " + produto.getPreco());
	}

}
