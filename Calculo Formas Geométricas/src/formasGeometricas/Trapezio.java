package formasGeometricas;

import interfaces.FaceGeometricas;

public class Trapezio implements FaceGeometricas {

	private double baseMaior;
	private double baseMenor;
	private double altura;

	public Trapezio(double baseMaior, double baseMenor, double altura) {
		super();
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}

	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calArea() {
		return ((this.baseMaior * this.baseMenor) * this.altura) / 2;
	}

	@Override
	public String toString() {
		return "Área do Trapezio= " + calArea();
	}

}
