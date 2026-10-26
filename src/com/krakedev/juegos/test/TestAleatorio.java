package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dealer dealer = new Dealer();

		int maximo = 20;

		int vecesCero = 0;
		int vecesMaximo = 0;
		int vecesFueraDeRango = 0;

		for (int i = 0; i < 100; i++) {
			int numeroAleatorio = dealer.generarAleatorio(maximo);

			System.out.println("Número generado: " + numeroAleatorio);

			if (numeroAleatorio == 0) {
				vecesCero++;
			}
			if (numeroAleatorio == maximo) {
				vecesMaximo++;
			}
			if (numeroAleatorio < 0 || numeroAleatorio > maximo) {
				vecesFueraDeRango++;
			}
		}

		System.out.println("Apariciones del 0: " + vecesCero);
		System.out.println("Apariciones del máximo (" + maximo + "): " + vecesMaximo);
		System.out.println("Fuera de rango: " + vecesFueraDeRango);
	}
}
