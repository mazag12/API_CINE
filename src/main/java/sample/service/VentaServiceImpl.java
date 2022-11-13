package sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sample.entity.Venta;
import sample.repositorio.VentaRepositorio;

@Service
public class VentaServiceImpl implements VentaService{

	@Autowired
	private VentaRepositorio VentaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Venta> ListarVenta() {
		return (List<Venta>) VentaRepository.findAll();
	}

	@Override
	@Transactional
	public void guardar(Venta venta) {
		VentaRepository.save(venta);
	}

	@Override
	@Transactional
	public void actualizar(Venta venta) {
		VentaRepository.save(venta);
	}

	@Override
	@Transactional
	public void eliminar(String cod) {
		VentaRepository.deleteById(cod);
	}

	@Override
	@Transactional(readOnly = true)
	public Venta encontrarVenta(String cod) {
		return VentaRepository.findById(cod).orElse(null);
	}

}
