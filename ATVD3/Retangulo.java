package ATVD3;

public class Retangulo extends FiguraGeometrica{
	private double base, altura;
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		return base * altura;
	}
	
	public String getDescricao() {
		String descric = getNome()+" - Base "+getBase()+", Altura "+ getAltura();
		return descric;
	}	

}
