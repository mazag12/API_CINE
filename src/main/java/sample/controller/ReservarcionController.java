package sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sample.entity.Reservacion;
import sample.service.ReservarService;

@RestController
public class ReservarcionController {
	
	@Autowired
	private ReservarService reservarservicio;
	
	@RequestMapping(path = "/Reservacion/lista", method = RequestMethod.GET)
	public List<Reservacion> lista() {
		return reservarservicio.ListarReservacion();
	}
	
	@RequestMapping(path = "/Reservacion/{codigo}", method = RequestMethod.GET)
	public  Reservacion  estado_reservacion(@PathVariable(name = "codigo", required = true) String cod) {
		
		Reservacion estado = reservarservicio.encontrarReservacion(cod);
		
		return estado;
	}
	
	@RequestMapping(path = "/Reservacion", method = RequestMethod.POST)
	public  String  reservacion(@RequestBody Reservacion reservaciones) {
		
		Reservacion reservacion = new Reservacion();
		
		reservacion.setId(null);
		reservacion.setIdpeli(reservaciones.getIdpeli());
		reservacion.setIdcliente(reservaciones.getIdcliente());
		reservacion.setIdreserva(2);
		reservacion.setContacto(reservaciones.getContacto());
		reservacion.setReserva(true);
		reservacion.setPago(false);
		reservacion.setEstado("A");
		
		return reservarservicio.guardar(reservacion);
	}
	
	
	
}
