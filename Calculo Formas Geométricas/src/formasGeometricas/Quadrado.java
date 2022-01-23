package formasGeometricas;

import interfaces.FaceGeometricas;

public class Quadrado implements FaceGeometricas {
	
	private double lado;
	

	public Quadrado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calArea() {
		return this.lado * this.lado;
	}
	
	@Override
	public String toString() {
		return "Área do Quadrado= " + calArea();
	}
	
	

}
