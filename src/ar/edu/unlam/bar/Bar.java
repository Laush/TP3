package ar.edu.unlam.bar;

import java.util.TreeSet;

public class Bar {
	
	private TreeSet<Cliente> clientes;
	private Boolean abierto;
	
	public Bar(){
		this.clientes = new TreeSet<Cliente>();
		this.abierto = false;
	}
	
	public TreeSet<Cliente> getClientes(){
		return this.clientes;
	}
	
	public void ingresarCliente(Cliente cliente){
		if(cliente != null){
			this.clientes.add(cliente);
		}
	}
	
	public void setClientes(TreeSet<Cliente> clientesNuevos){
		this.clientes = clientesNuevos;
	}
	
	public void abrirBar(){
		this.abierto = true;
	}
	
	public void cerrarBar(){
		this.abierto = false;
	}
	
	public Boolean barAbierto(){
		return this.abierto;
	}
}

