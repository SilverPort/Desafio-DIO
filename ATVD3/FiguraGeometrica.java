package ATVD3;

abstract public class FiguraGeometrica {
	private String nome;
	
	public abstract double getArea();
	public abstract String getDescricao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
