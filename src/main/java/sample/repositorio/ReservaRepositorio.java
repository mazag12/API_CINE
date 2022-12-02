package sample.repositorio;

import org.springframework.data.repository.CrudRepository;

import sample.entity.Reservacion;

public interface ReservaRepositorio extends CrudRepository<Reservacion, String>{

	Reservacion findByIdcliente(String cliente);
	
}
