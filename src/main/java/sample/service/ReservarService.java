package sample.service;

import java.util.List;

import sample.entity.Reservacion;


public interface ReservarService {

	public List<Reservacion> ListarReservacion();
	
	public String guardar (Reservacion reservacion);
	
	public void actualizar (Reservacion reservacion);
	
	public void eliminar (String cod);
	
	public Reservacion encontrarReservacion(String cod);
	
}
