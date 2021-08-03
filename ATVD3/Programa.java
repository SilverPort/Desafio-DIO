package ATVD3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>() ;
		char resposta = 'n';
		
		do {
			Retangulo r = new Retangulo();
			Triangulo t = new Triangulo();
			Circulo c = new Circulo();
			
			System.out.println("Entre com a Altura pra o Retângulo:");
			r.setAltura(in.nextDouble());
			System.out.println("Entre com a Base pra o Retângulo:");
			r.setBase(in.nextDouble());
			r.setNome("Retângulo");
			listaFigurasGeometricas.add( r );   
			
			System.out.println("Entre com a Altura pra o Triângulo:");
			t.setAltura(in.nextDouble());
			System.out.println("Entre com a Base pra o Triângulo:");
			t.setBase(in.nextDouble());
			t.setNome("Triângulo");
			listaFigurasGeometricas.add( t );
			
			System.out.println("Entre com o Raio pra o Circulo:");
			c.setRaio(in.nextDouble());
			c.setNome("Círculo");
			
			System.out.println("OK, deseja continuar? S p/ Sim e N p/ Não");
			listaFigurasGeometricas.add( c );
			resposta = in.next().charAt(0);
				
		}while(resposta == 'S' || resposta == 's');
		
		for(FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {

			System.out.println( figuraGeometrica.getDescricao() );
			

			System.out.printf( "Area da figura: %.2f m²\n", figuraGeometrica.getArea() );

		}
	}

}
