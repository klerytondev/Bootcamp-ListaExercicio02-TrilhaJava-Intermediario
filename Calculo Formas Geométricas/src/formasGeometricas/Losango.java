package formasGeometricas;

import interfaces.FaceGeometricas;

public class Losango implements FaceGeometricas {

	private double dMaior;
	private double dMenor;

	public Losango(double dMaior, double dMenor) {
		super();
		this.dMaior = dMaior;
		this.dMenor = dMenor;
	}

	public double getdMaior() {
		return dMaior;
	}

	public void setdMaior(double dMaior) {
		this.dMaior = dMaior;
	}

	public double getdMenor() {
		return dMenor;
	}

	public void setdMenor(double dMenor) {
		this.dMenor = dMenor;
	}

	@Override
	public double calArea() {
		return (this.dMaior * this.dMenor) / 2;
	}

	@Override
	public String toString() {
		return "Área do Losango= " + calArea();
	}

}
