package formasGeometricas;

import java.util.Scanner;

/*
 * 
 * 02 - Criar um programa que o usuario solicitar� via Scanner a forma 
 * geometrica e de acordo com os dados o sistema deve fazer o calculo 
 * referente a forma geometrica e mostrar o valor para o usuario do calculo.
 * 
 * Deve usar Interface para algo comum entre as formas geometricas e obrigaoriamente
 *  cada forma geometrica deve ser uma classe.
 * 
 *@Kleryton de Souza 
 * 
 * */

public class Aplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String op;

		System.out.println("-----------------------CALCULO DE �REAS-------------------------");

		do {

			System.out.println("Digite: \n1 - Triangulo\n2 - Quadrado\n3 - Losango\n4 - Retangulo\n5 - Trap�zio"
					+ "\n6 - Circulo: ");
			System.out.print("==================================================================\n");
			new Userful(sc.nextInt());
			System.out.println("\n==================================================================");

			System.out.println("Deseja calcular a �rea de outra Forma Geom�trica: S - SIM ou N - N�O: ");
			op = sc.next();
			System.out.print("==================================================================\n");

		} while (op.equalsIgnoreCase("s"));

		System.out.println("\"-----------------------FIM DA EXECU��O-------------------------\"");

		sc.close();
	}

}
