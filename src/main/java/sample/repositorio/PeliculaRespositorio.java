package sample.repositorio;

import org.springframework.data.repository.CrudRepository;

import sample.entity.Pelicula;

public interface PeliculaRespositorio extends CrudRepository<Pelicula, String> {

}
