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

import sample.entity.Usercine;
import sample.service.UserService;

@RestController
//@RequestMapping("/Usuario")
public class UserController {

	@Autowired
	private UserService usuarioservicio;
	
	//@GetMapping("/lista")
	@RequestMapping(path = "/Usuario/lista", method = RequestMethod.GET)
	public List<Usercine> lista() {
		return usuarioservicio.ListarUsuario();
	}	
	
	//@GetMapping("/lista/{codigo}")
	@RequestMapping(path = "/Usuario/{codigo}", method = RequestMethod.GET)
	public  Usercine List(@RequestParam("codigo") Integer cod) {
		return usuarioservicio.encontrarUsuario(cod);
	}
	
	//@PostMapping("/registar")
	@RequestMapping(path = "/Usuario", method = RequestMethod.POST)
	public void registrar(@RequestBody Usercine usuario) {
		usuarioservicio.guardar(usuario);
	}
	
	//@PutMapping("/actualizar")
	@RequestMapping(path = "/Usuario", method = RequestMethod.PUT)
	public void actualizar(@RequestBody Usercine usuario) {
		usuarioservicio.guardar(usuario);
	}
	
	//@DeleteMapping("/eliminar/{codigo}")
	@RequestMapping(path = "/Usuario/{codigo}", method = RequestMethod.DELETE)
	public void eliminar(@RequestParam("codigo") Integer cod) {
		usuarioservicio.eliminar(cod);
	}
	
	//@GetMapping("/buscar/{nombre}")
	@RequestMapping(path = "/Usuario/Buscar/{codigo}", method = RequestMethod.GET)
	public Usercine buscar(@RequestParam("nombre") String nombre) {
		return usuarioservicio.buscarNombre(nombre);
	}
	
}
