package formasGeometricas;

import interfaces.FaceGeometricas;

public class Circulo implements FaceGeometricas {

	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calArea() {
		return Math.PI * (this.raio * this.raio);
	}

	@Override
	public String toString() {
		return "Área do Tirculo= " + calArea();
	}

}
