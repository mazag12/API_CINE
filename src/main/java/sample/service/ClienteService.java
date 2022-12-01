package sample.service;

import java.util.List;

import sample.entity.Cliente;

public interface ClienteService {

	public List<Cliente> ListarCliente();
	
	public void guardar (Cliente cliente);
	
	public void actualizar (Cliente cliente);
	
	public void eliminar (String cod);
	
	public Cliente encontrarCliente(String cod);
	
	public Cliente buscarCliente(String nombre);
	
}
