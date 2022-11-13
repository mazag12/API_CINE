package sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sample.entity.Tipopelicula;
import sample.repositorio.TipopeliculaRepositorio;

@Service
public class TipopeliculaServiceImpl implements TipopeliculaService{

	@Autowired
	private TipopeliculaRepositorio TipopeliculaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Tipopelicula> ListarTipopelicula() {
		return (List<Tipopelicula>) TipopeliculaRepository.findAll();
	}

	@Override
	@Transactional
	public void guardar(Tipopelicula usuario) {
		TipopeliculaRepository.save(usuario);
	}

	@Override
	@Transactional
	public void actualizar(Tipopelicula usuario) {
		TipopeliculaRepository.save(usuario);
	}

	@Override
	@Transactional
	public void eliminar(Integer cod) {
		TipopeliculaRepository.deleteById(cod);
	}

	@Override
	@Transactional(readOnly = true)
	public Tipopelicula encontrarTipopelicula(Integer cod) {
		return TipopeliculaRepository.findById(cod).orElse(null);
	}

}
