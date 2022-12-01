package sample.repositorio;

import org.springframework.data.repository.CrudRepository;

import sample.entity.Cliente;

public interface ClienteRespositorio  extends CrudRepository<Cliente, String> {

	Cliente findByNombre(String nombre);
	
}
