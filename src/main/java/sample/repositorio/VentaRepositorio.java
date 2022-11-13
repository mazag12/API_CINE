package sample.repositorio;

import org.springframework.data.repository.CrudRepository;

import sample.entity.Venta;

public interface VentaRepositorio extends CrudRepository<Venta, String>{

}
