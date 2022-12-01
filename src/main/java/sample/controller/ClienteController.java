package sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sample.entity.Cliente;
import sample.service.ClienteService;

@RestController
//@RequestMapping("/Cliente")
public class ClienteController{

	@Autowired
	private ClienteService clienteservicio;
//	
	//@GetMapping("/lista")
	@RequestMapping(path = "/Cliente/lista", method = RequestMethod.GET)
	public List<Cliente> lista() {
		return clienteservicio.ListarCliente();
	}	
//	
//	//@GetMapping("/lista/{codigo}")
	@RequestMapping(path = "/Cliente/{codigo}", method = RequestMethod.GET)
	public  Cliente List(@PathVariable(name = "codigo", required = true) String cod) {
		return clienteservicio.encontrarCliente(cod);
	}
//	
//	//@PostMapping("/registar")
	@RequestMapping(path = "/Cliente", method = RequestMethod.POST)
	public void registrar(@RequestBody Cliente usuario) {
		clienteservicio.guardar(usuario);
	}
//	
//	//@PutMapping("/actualizar")
	@RequestMapping(path = "/Cliente", method = RequestMethod.PUT)
	public void actualizar(@RequestBody Cliente usuario) {
		clienteservicio.guardar(usuario);
	}
//	
//	//@DeleteMapping("/eliminar/{codigo}")
	@RequestMapping(path = "/Cliente/{codigo}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable(name = "codigo", required = true) String cod) {
		clienteservicio.eliminar(cod);
	}
	
	@RequestMapping(path = "/Cliente/buscar/{nombre}", method = RequestMethod.GET)
	public  Cliente  buscar(@PathVariable(name = "nombre", required = true) String nombre) {
		return clienteservicio.buscarCliente(nombre);
	}
	
}
