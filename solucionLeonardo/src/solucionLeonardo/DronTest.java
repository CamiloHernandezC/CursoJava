package solucionLeonardo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DronTest {
	
	@Test
	void testGirarHorario() {
		Dron dron = new Dron();
		dron.girarHorario();
		assertEquals("oriente", dron.getOrientacion());
	}
	
	@Test
	void testGirarAntiHorario() {
		Dron dron = new Dron();
		dron.girarAntihorario();
		assertEquals("occidente", dron.getOrientacion());
	}
	
	@Test
	void testTurnClockWise() {
		Dron dron = new Dron();
		dron.turn(true);
		assertEquals(90, dron.getFrontSide());
	}
	
	@Test
	void testTurnClockWise5Times() {
		Dron dron = new Dron();
		dron.turn(true);
		dron.turn(true);
		dron.turn(true);
		dron.turn(true);
		dron.turn(true);
		assertEquals(90, dron.getFrontSide());
	}
	
	@Test
	void testTurnClockWiseFrom270To360() {
		Dron dron = new Dron();
		dron.setFrontSide(270);
		dron.turn(true);
		assertEquals(0, dron.getFrontSide());
	}
	
	@Test
	void testTurnCounterClockWise() {
		Dron dron = new Dron();
		dron.turn(false);
		assertEquals(270, dron.getFrontSide());
	}
	
	@Test
	void testAvanzar() {
		Dron dron = new Dron();
		dron.avanzar(3);
		assertEquals(3, dron.getY());
	}
	
	@Test
	void testAvanzarConCambioDeOrientacion() {
		Dron dron = new Dron();
		dron.avanzar(3);
		assertEquals(3, dron.getY());
		dron.girarAntihorario();
		dron.avanzar(2);
		assertEquals(-2, dron.getX());
	}
	
	@Test
	void testProcesarComando() {
		Dron dron = new Dron();
		dron.procesarComando("AADAAAIA");
		assertEquals(3, dron.getX());
		assertEquals(3, dron.getY());
	}
	
	@Test
	void testProcesarVariosComandos() {
		Dron dron = new Dron();
		dron.procesarComando("AADAAAIA");
		dron.procesarComando("DAADAAAA");
		assertEquals(5, dron.getX());
		assertEquals(-1, dron.getY());
	}

}
