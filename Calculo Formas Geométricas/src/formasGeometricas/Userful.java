package formasGeometricas;

import java.util.Scanner;

public class Userful {

	Scanner sc = new Scanner(System.in);

	public Userful(int op) {

		switch (op) {

		case 1:
			System.out.print("Digite a base do triangulo: ");
			double base = sc.nextDouble();
			System.out.print("Digite altura do triangulo: ");
			double altura = sc.nextDouble();
			Triangulo triangulo = new Triangulo(base, altura);
			System.out.println("==================================================================");
			System.out.println(triangulo);
			break;

		case 2:
			System.out.print("Digite o lado do quadrado: ");
			double lado = sc.nextDouble();
			Quadrado quadrado = new Quadrado(lado);
			System.out.println("==================================================================");
			System.out.println(quadrado);
			break;

		case 3:
			System.out.print("Digite a diagonal maior do Losango: ");
			double dMaior = sc.nextDouble();
			System.out.print("Digitea a diagonal menor do Losango: ");
			double dMenor = sc.nextDouble();
			Losango losango = new Losango(dMaior, dMenor);
			System.out.println("==================================================================");
			System.out.println(losango);
			break;

		case 4:
			System.out.print("Digite a base do retangulo: ");
			double baseR = sc.nextDouble();
			System.out.print("Digite a altura do retangulo: ");
			double alturaR = sc.nextDouble();
			Retangulo retangulo = new Retangulo(baseR, alturaR);
			System.out.println("==================================================================");
			System.out.println(retangulo);
			break;

		case 5:
			System.out.print("Digite a base maior do Trapézio: ");
			double baseMaior = sc.nextDouble();
			System.out.print("Digite a base menor do Losango ");
			double baseMenor = sc.nextDouble();
			System.out.print("Digite a altura do Losango ");
			double alturaL = sc.nextDouble();
			Trapezio trapezio = new Trapezio(baseMaior, baseMenor, alturaL);
			System.out.println("==================================================================");
			System.out.println(trapezio);
			break;

		case 6:
			System.out.print("Digite o raio do circulo: ");
			double raio = sc.nextDouble();
			Circulo circulo = new Circulo(raio);
			System.out.println("==================================================================");
			System.out.println(circulo);
			break;
		}

	}

}
