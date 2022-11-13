package sample.service;

import java.util.List;

import sample.entity.Comestible;

public interface ComestibleService {

	public List<Comestible> ListarComestible();
	
	public void guardar (Comestible comestible);
	
	public void actualizar (Comestible comestible);
	
	public void eliminar (Integer cod);
	
	public Comestible encontrarComestible(Integer cod);
	
}
