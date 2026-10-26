package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		Juego21 juego = new Juego21();

		Jugador jugador1 = new Jugador("Jugador 1");
		Jugador jugador2 = new Jugador("Jugador 2");
		Jugador jugador3 = new Jugador("Jugador 3");

		juego.agregarJugador(jugador1);
		juego.agregarJugador(jugador2);
		juego.agregarJugador(jugador3);

		for (int i = 0; i < 10; i++) {
			System.out.println("-----PARTIDA " + (i + 1) + "------");

			jugador1.getCartas().clear();
			jugador1.setPuntajeCartas(0);

			jugador2.getCartas().clear();
			jugador2.setPuntajeCartas(0);

			jugador3.getCartas().clear();
			jugador3.setPuntajeCartas(0);

			juego.inicializar();

			ArrayList<Jugador> ganadores = juego.jugar();

			if (!ganadores.isEmpty()) {
				System.out.println("GANADORES");
				for (Jugador ganador : ganadores) {
					System.out.println(ganador.getNickname() + " ganó con " + ganador.getPuntajeCartas() + " puntos.");
				}
			} else {
				System.out.println("Nadie logró 21 puntos. Resultados: ");
				System.out.println(jugador1.getNickname() + " se quedó con " + jugador1.getPuntajeCartas());
				System.out.println(jugador2.getNickname() + " se quedó con " + jugador2.getPuntajeCartas());
				System.out.println(jugador3.getNickname() + " se quedó con " + jugador3.getPuntajeCartas());
			}
		}
	}
}
