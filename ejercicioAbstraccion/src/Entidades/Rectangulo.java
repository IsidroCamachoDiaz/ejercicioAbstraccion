package Entidades;

public class Rectangulo extends Figura{
	private int base;
	private int lados;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getLados() {
		return lados;
	}
	public void setLados(int lados) {
		this.lados = lados;
	}
	
	public Rectangulo(String tipo, int base, int lados) {
		super(tipo);
		this.base = base;
		this.lados = lados;
	}
	
	public double area() {
		return this.base*this.lados;
	}
}
