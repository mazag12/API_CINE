package sample.repositorio;

import org.springframework.data.repository.CrudRepository;

import sample.entity.Tipopelicula;

public interface TipopeliculaRepositorio extends CrudRepository<Tipopelicula, Integer>{

}
