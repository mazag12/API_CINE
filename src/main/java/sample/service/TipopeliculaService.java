package sample.service;

import java.util.List;

import sample.entity.Tipopelicula;

public interface TipopeliculaService {

	public List<Tipopelicula> ListarTipopelicula();
	
	public void guardar (Tipopelicula tipopelicula);
	
	public void actualizar (Tipopelicula tipopelicula);
	
	public void eliminar (Integer cod);
	
	public Tipopelicula encontrarTipopelicula(Integer cod);
	
}
