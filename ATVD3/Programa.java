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
			
			System.out.println("Entre com a Altura pra o Ret�ngulo:");
			r.setAltura(in.nextDouble());
			System.out.println("Entre com a Base pra o Ret�ngulo:");
			r.setBase(in.nextDouble());
			r.setNome("Ret�ngulo");
			listaFigurasGeometricas.add( r );   
			
			System.out.println("Entre com a Altura pra o Tri�ngulo:");
			t.setAltura(in.nextDouble());
			System.out.println("Entre com a Base pra o Tri�ngulo:");
			t.setBase(in.nextDouble());
			t.setNome("Tri�ngulo");
			listaFigurasGeometricas.add( t );
			
			System.out.println("Entre com o Raio pra o Circulo:");
			c.setRaio(in.nextDouble());
			c.setNome("C�rculo");
			
			System.out.println("OK, deseja continuar? S p/ Sim e N p/ N�o");
			listaFigurasGeometricas.add( c );
			resposta = in.next().charAt(0);
				
		}while(resposta == 'S' || resposta == 's');
		
		for(FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {

			System.out.println( figuraGeometrica.getDescricao() );
			

			System.out.printf( "Area da figura: %.2f m�\n", figuraGeometrica.getArea() );

		}
	}

}
