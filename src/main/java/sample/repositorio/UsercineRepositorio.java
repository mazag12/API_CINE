package sample.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import sample.entity.Usercine;

public interface UsercineRepositorio extends JpaRepository<Usercine, Integer>{

	Usercine findByNombre(String nombre);
	
}
