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
	public Integer guardar(Venta venta) {
		Venta nuevaVenta = VentaRepository.save(venta);
		return nuevaVenta.getIdventa();
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
