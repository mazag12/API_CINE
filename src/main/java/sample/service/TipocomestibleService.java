package sample.service;

import java.util.List;

import sample.entity.TipoComestible;

public interface TipocomestibleService {

	public List<TipoComestible> ListarTipoComestible();
	
	public void guardar (TipoComestible TipoComestible);
	
	public void actualizar (TipoComestible tipoComestible);
	
	public void eliminar (Integer cod);
	
	public TipoComestible encontrarTipoComestible(Integer cod);
	
}
