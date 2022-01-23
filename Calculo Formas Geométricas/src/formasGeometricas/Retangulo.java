package formasGeometricas;

import interfaces.FaceGeometricas;

public class Retangulo implements FaceGeometricas {

	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

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

	public double calArea() {
		return this.base * this.altura;
	}
	
	@Override
	public String toString() {
		return "Área do Retangulo= " + calArea();
	}

}
