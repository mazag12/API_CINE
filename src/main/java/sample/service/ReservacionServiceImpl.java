package sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.entity.Reservacion;
import sample.repositorio.ReservaRepositorio;

@Service
public class ReservacionServiceImpl implements ReservarService{

	@Autowired
	private ReservaRepositorio reservacionRepositorio;
	
	@Override
	public List<Reservacion> ListarReservacion() {
		return (List<Reservacion>) reservacionRepositorio.findAll();
	}

	@Override
	public String guardar(Reservacion reservacion) {
		Reservacion reserva = reservacionRepositorio.save(reservacion);
		return reserva.getId();
	}

	@Override
	public void actualizar(Reservacion reservacion) {
		reservacionRepositorio.save(reservacion);
	}

	@Override
	public void eliminar(String cod) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Reservacion encontrarReservacion(String cod) {
		return reservacionRepositorio.findById(cod).orElse(null);
	}

	
	
}
