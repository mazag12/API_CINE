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
import org.springframework.web.bind.annotation.RestController;

import sample.entity.Pelicula;
import sample.entity.Tipopelicula;
import sample.service.PeliculaService;
import sample.service.TipopeliculaService;

@RestController
//@RequestMapping("/Pelicula")
public class PeliculaController {

	@Autowired
	private PeliculaService peliculaservicio;
	
	@Autowired
	private TipopeliculaService tipopeliculaservicio;
	
	//@GetMapping("/lista")
	@RequestMapping(path = "/Pelicula/lista", method = RequestMethod.GET)
	public List<Pelicula> lista() {
		return peliculaservicio.ListarPelicula();
	}	
	
	//@GetMapping("/lista/{codigo}")
	@RequestMapping(path = "/Pelicula/{codigo}", method = RequestMethod.GET)
	public  Pelicula List(@PathVariable("codigo") String cod) {
		return peliculaservicio.encontrarPelicula(cod);
	}
	
	//@PostMapping("/registar")
	@RequestMapping(path = "/Pelicula", method = RequestMethod.POST)
	public void registrar(@RequestBody Pelicula usuario) {
		peliculaservicio.guardar(usuario);
	}
	
	//@PutMapping("/actualizar")
	@RequestMapping(path = "/Pelicula", method = RequestMethod.PUT)
	public void actualizar(@RequestBody Pelicula usuario) {
		peliculaservicio.guardar(usuario);
	}
	
	//@DeleteMapping("/eliminar/{codigo}")
	@RequestMapping(path = "/Pelicula/{codigo}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable("codigo") String cod) {
		peliculaservicio.eliminar(cod);
	}
	
//	TIPO DE PELICULAS
	
	//@GetMapping("/Tipo/lista")
	@RequestMapping(path = "/Tipo/lista", method = RequestMethod.GET)
	public List<Tipopelicula> listaTipoPelicula() {
		return tipopeliculaservicio.ListarTipopelicula();
	}	
	
	//@GetMapping("/Tipo/lista/{codigo}")
	@RequestMapping(path = "/Tipo/{codigo}", method = RequestMethod.GET)
	public  Tipopelicula ListTipoPelicula(@PathVariable("codigo") Integer cod) {
		return tipopeliculaservicio.encontrarTipopelicula(cod);
	}
	
	//@PostMapping("/Tipo/registar")
	@RequestMapping(path = "/Tipo", method = RequestMethod.POST)
	public void registrarTipoPelicula(@RequestBody Tipopelicula tipopelicula) {
		tipopeliculaservicio.guardar(tipopelicula);
	}
	
	//@PutMapping("/Tipo/actualizar")
	@RequestMapping(path = "/Tipo", method = RequestMethod.PUT)
	public void actualizarTipoPelicula(@RequestBody Tipopelicula tipopelicula) {
		tipopeliculaservicio.guardar(tipopelicula);
	}
	
	//@DeleteMapping("/Tipo/eliminar/{codigo}")
	@RequestMapping(path = "/Tipo/{codigo}", method = RequestMethod.DELETE)
	public void eliminarTipoPelicula(@PathVariable("codigo") Integer cod) {
		tipopeliculaservicio.eliminar(cod);
	}
	
	
}
