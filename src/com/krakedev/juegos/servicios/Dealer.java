package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;

public class Dealer {

	private ArrayList<Carta> naipe;

	public Dealer() {

		this.naipe = new ArrayList<>();
		generarNaipe();

	}

	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}

	public void generarNaipe() {

		String[] palos = { "T", "CN", "CR", "D" };
		String[] valores = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		for (String palo : palos) {
			for (String valor : valores) {
				Carta nuevaCarta = new Carta();

				nuevaCarta.setValor(valor);
				nuevaCarta.setPalo(palo);

				naipe.add(nuevaCarta);
			}

		}

	}

	public void imprimirNaipe() {

		for (Carta carta : naipe) {

			carta.imprimir();
		}
	}

	public int generarAleatorio(int maximo) {

		double aleatorio = Math.random() * (maximo + 1);

		int aleatorioInt = (int) aleatorio;
		return aleatorioInt;
	}

	public Carta entregarCarta() {

		int aleatorio = generarAleatorio(naipe.size() - 1);

		Carta cartaElegida = naipe.get(aleatorio);

		naipe.remove(aleatorio);

		return cartaElegida;
	}
}
