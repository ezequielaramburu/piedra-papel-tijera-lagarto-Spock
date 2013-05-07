


package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra", Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
		assertEquals("Spock vaporiza piedra", Resultado.EMPATA, jugadorUno.jugarCon(jugadorUno));
		assertEquals("Spock vaporiza piedra", Resultado.EMPATA, jugadorDos.jugarCon(jugadorDos));
		assertEquals("Spock vaporiza piedra", Resultado.PIERDE, jugadorDos.jugarCon(jugadorUno));
	}
	
	@Test
	public void quePapelCubrePiedra() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Papel cubre piedra", Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
		assertEquals("Papel cubre piedra", Resultado.EMPATA, jugadorUno.jugarCon(jugadorUno));
		assertEquals("Papel cubre piedra", Resultado.EMPATA, jugadorDos.jugarCon(jugadorDos));
		assertEquals("Papel cubre piedra", Resultado.PIERDE, jugadorDos.jugarCon(jugadorUno));
	}




@Test
public void quePiedraAplastaLagarto() {

	Mano jugadorUno = new Mano(Forma.PIEDRA);
	Mano jugadorDos = new Mano(Forma.LAGARTO);

	assertEquals("Piedra aplasta lagarto", Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
	assertEquals("Piedra aplasta lagarto", Resultado.EMPATA, jugadorUno.jugarCon(jugadorUno));
	assertEquals("Piedra aplasta lagarto", Resultado.EMPATA, jugadorDos.jugarCon(jugadorDos));
	assertEquals("Piedra aplasta lagarto", Resultado.PIERDE, jugadorDos.jugarCon(jugadorUno));
}

}