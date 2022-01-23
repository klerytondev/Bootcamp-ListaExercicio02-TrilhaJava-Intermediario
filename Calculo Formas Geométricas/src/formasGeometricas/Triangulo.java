package formasGeometricas;

import interfaces.FaceGeometricas;

public class Triangulo implements FaceGeometricas {

	private double base;
	private double altura;
	

	public Triangulo(double base, double altura) {
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

	@Override
	public double calArea() {

		return (this.base * this.altura) / 2;

	}

	@Override
	public String toString() {
		return "Área do Triangulo= " + calArea();
	}
	

}
