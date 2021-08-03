package ATVD2;

import java.util.Scanner;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CriaPedido {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numPedido = 1;
		char c = '.';
		//Inicia uma Lista de Objetos
		List<Produto> produtos = new ArrayList<>();
		
		do { // Cria um produto, seta  os atributos, e popula a lista ArrayLista
		
			Produto produto = new Produto(); // cria um novo objeto
			
			System.out.print("Entre com um Produto:");  // solicita um nome para o produto
			produto.setNome(in.nextLine());				// seta nome no atributo nome do objeto
			
			System.out.print("Entre com um Preço:");   // solicita o valor do produto
			BigDecimal preco = new BigDecimal(in.nextLine()); // guarda o valor 
			produto.setPreco(preco);      // sela valor no atributo preço do abjeto
			
			produto.setId(numPedido); // seta um ID pra o produto
			numPedido += 1;              
			
			produtos.add(produto);  // adiciona o produto na lista
			
			System.out.print("Deseja continuar? (S) para 'SIM' e (N) para 'NÃO'"); // pergunta se deseja cadasttarr mais
			c = in.next().charAt(0); // guarda a resposta
			
			}while(c != 'N' || c != 'n' );  // reinicia o ciclo, caso for verdadeiro
	
		Pedido novoPedido = new Pedido(); // um objeto tipo Pedido

		novoPedido.setId(1);  // seta um ID do pedido
		System.out.println("\nID pedido: " + novoPedido.getId()); // resgata o valor do ID
		
		novoPedido.setDataPedido(LocalDateTime.now()); // Seta a data atual no atributo data
		
		System.out.println("Data: " + novoPedido.getDataPedido()); // recupera a data setada
		
		
		novoPedido.setProdutos(produtos); // Seta a lista de produtos no atributo produtos
		
		// imprime as informações da lista de pedidos
		for(int i = 0; i< produtos.size(); i++) {
			System.out.println("ID "+produtos.get(i).getId());
			System.out.println("PRODUTO "+produtos.get(i).getNome());
			System.out.println("PREÇO "+produtos.get(i).getPreco());
			System.out.println("-------------------");
		}
		System.out.println(" TOTAL : "+novoPedido.getValorPedido()); // imprime a soma total dos preços
	}

}
