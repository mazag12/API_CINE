package sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sample.entity.Pelicula;
import sample.repositorio.PeliculaRespositorio;

@Service
public class PeliculaServiceImpl implements PeliculaService{

	@Autowired
	private PeliculaRespositorio peliculaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Pelicula> ListarPelicula() {
		return (List<Pelicula>) peliculaRepository.findAll();
	}

	@Override
	@Transactional
	public void guardar(Pelicula pelicula) {
		peliculaRepository.save(pelicula);
	}

	@Override
	@Transactional
	public void actualizar(Pelicula pelicula) {
		peliculaRepository.save(pelicula);
	}

	@Override
	@Transactional
	public void eliminar(String cod) {
		peliculaRepository.deleteById(cod);
	}

	@Override
	@Transactional(readOnly = true)
	public Pelicula encontrarPelicula(String cod) {
		return peliculaRepository.findById(cod).orElse(null);
	}

	@Override
	public Pelicula nombrePelicula(String nombre) {
		return peliculaRepository.findByTitulo(nombre);
	}

	
	
}
