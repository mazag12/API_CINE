package sample.service;

import java.util.List;

import sample.entity.Venta;

public interface VentaService {

	public List<Venta> ListarVenta();
	
	public void guardar (Venta venta);
	
	public void actualizar (Venta venta);
	
	public void eliminar (String cod);
	
	public Venta encontrarVenta(String cod);
	
}
