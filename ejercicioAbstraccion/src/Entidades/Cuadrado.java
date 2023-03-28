package Entidades;

public class Cuadrado extends Figura{
	private int lados;
	private int vertices;
	public int getLados() {
		return lados;
	}
	public void setLados(int lados) {
		this.lados = lados;
	}
	public int getVertices() {
		return vertices;
	}
	public void setVertices(int vertices) {
		this.vertices = vertices;
	}
	
	public Cuadrado(String tipo, int lados, int vertices) {
		super(tipo);
		this.lados = lados;
		this.vertices = vertices;
	}
	
	@Override 
    public double area() {
         return this.lados*this.lados; 
    }
}
