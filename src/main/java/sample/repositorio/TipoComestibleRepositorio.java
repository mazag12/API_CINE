package sample.repositorio;

import org.springframework.data.repository.CrudRepository;

import sample.entity.TipoComestible;

public interface TipoComestibleRepositorio extends CrudRepository<TipoComestible, String> {

}
