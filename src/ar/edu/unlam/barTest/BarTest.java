package ar.edu.unlam.barTest;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

import ar.edu.unlam.bar.Bar;
import ar.edu.unlam.bar.Cliente;
import ar.edu.unlam.bar.Comparador;

public class BarTest {

	@Test
	public void queElBarEsteAbierto() {
		Bar miBar = new Bar();
		
		miBar.abrirBar();
		
		assertTrue(miBar.barAbierto());
	}

	@Test
	public void queLosClientesIngresenAlBarConNombresIguales(){
		Bar miBar = new Bar();
		
		miBar.ingresarCliente(new Cliente("Tomas", 21));
		miBar.ingresarCliente(new Cliente("Tomas", 22));
		miBar.ingresarCliente(new Cliente("Agustin", 23));
		miBar.ingresarCliente(new Cliente("Cecilia", 24));
		miBar.ingresarCliente(new Cliente("Tomas", 25));
		
		assertEquals(miBar.getClientes().size(), 3);
	}
	
	@Test
	public void queLosClientesSeOrdenenPorNombre(){
		Bar miBar = new Bar();
		
		miBar.ingresarCliente(new Cliente("Tomas", 21));
		miBar.ingresarCliente(new Cliente("Tomas", 22));
		miBar.ingresarCliente(new Cliente("Agustin", 23));
		miBar.ingresarCliente(new Cliente("Cecilia", 24));
		miBar.ingresarCliente(new Cliente("Tomas", 25));
		
		assertEquals(miBar.getClientes().first().getNombre(), "Agustin");
		assertEquals(miBar.getClientes().last().getNombre(), "Tomas");
	}
	
	@Test
	public void compararClientesPorNombre(){
		Cliente miCliente1 = new Cliente("Tomas", 21);
		Cliente miCliente2 = new Cliente("Tomas", 22);
		Cliente miCliente3 = new Cliente("Agustin", 23);
		
		assertEquals(miCliente1.compareTo(miCliente2), 0);
		assertNotEquals(miCliente1.compareTo(miCliente3), 0);
	}
	
	@Test
	public void queLosClientesSeOrdenenPorEdad(){
		Comparador comparador = new Comparador();
		Bar miBar = new Bar();
		
		miBar.ingresarCliente(new Cliente("Tomas", 21));
		miBar.ingresarCliente(new Cliente("Tomas", 22));
		miBar.ingresarCliente(new Cliente("Agustin", 23));
		miBar.ingresarCliente(new Cliente("Cecilia", 24));
		miBar.ingresarCliente(new Cliente("Tomas", 25));
		
		TreeSet <Cliente> clientesOrdenadosPorEdad = new TreeSet <Cliente>(comparador);
		clientesOrdenadosPorEdad.addAll(miBar.getClientes());
		miBar.setClientes(clientesOrdenadosPorEdad);
		
		assertEquals("Tomas", miBar.getClientes().first().getNombre());
		assertEquals("Cecilia", miBar.getClientes().last().getNombre());
	}
}

