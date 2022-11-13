package sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sample.entity.Venta;
import sample.service.VentaService;

@RestController
//@RequestMapping("/Venta")
public class VentaController {

	@Autowired
	private VentaService ventaservicio;
	
	//@GetMapping("/lista")
	@RequestMapping(path = "/Venta/lista", method = RequestMethod.GET)
	public List<Venta> lista() {
		return ventaservicio.ListarVenta();
	}	
	
	//@GetMapping("/lista/{codigo}")
	@RequestMapping(path = "/Venta/{codigo}", method = RequestMethod.GET)
	public  Venta List(@RequestParam("codigo") String cod) {
		return ventaservicio.encontrarVenta(cod);
	}
	
	//@PostMapping("/registar")
	@RequestMapping(path = "/Venta", method = RequestMethod.POST)
	public void registrar(@RequestBody Venta venta) {
		ventaservicio.guardar(venta);
	}
	
	//@PutMapping("/actualizar")
	@RequestMapping(path = "/Venta", method = RequestMethod.PUT)
	public void actualizar(@RequestBody Venta venta) {
		ventaservicio.guardar(venta);
	}
	
	//@DeleteMapping("/eliminar/{codigo}")
	@RequestMapping(path = "/Venta/{codigo}", method = RequestMethod.DELETE)
	public void eliminar(@RequestParam("codigo") String cod) {
		ventaservicio.eliminar(cod);
	}
		
}
