package sample.service;

import java.util.List;

import sample.entity.Pelicula;

public interface PeliculaService {

	public List<Pelicula> ListarPelicula();
	
	public void guardar (Pelicula pelicula);
	
	public void actualizar (Pelicula pelicula);
	
	public void eliminar (String cod);
	
	public Pelicula encontrarPelicula(String cod);
	
	public Pelicula nombrePelicula(String nombre);
	
}
