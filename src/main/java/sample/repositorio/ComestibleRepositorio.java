package sample.repositorio;

import org.springframework.data.repository.CrudRepository;

import sample.entity.Comestible;

public interface ComestibleRepositorio extends CrudRepository<Comestible, String>{

}
