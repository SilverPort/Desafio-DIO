package ATVD3;

public class Circulo extends FiguraGeometrica{
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return ((raio * raio)* 3.14);
	}
	
	public String getDescricao() {
		String descric = getNome()+" - Raio "+getRaio();
		return descric;
	}	

}
