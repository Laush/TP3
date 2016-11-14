package ar.edu.unlam.bar;

import java.util.Comparator;

public class Comparador implements Comparator<Cliente> {

	@Override
	public int compare(Cliente primerCliente, Cliente segundoCliente){
		return primerCliente.getEdad() - segundoCliente.getEdad();
	}
	
}

