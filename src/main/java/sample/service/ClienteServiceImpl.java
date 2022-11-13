package sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sample.entity.Cliente;
import sample.repositorio.ClienteRespositorio;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRespositorio clienteRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> ListarCliente() {
		return (List<Cliente>) clienteRepository.findAll();
	}

	@Override
	@Transactional
	public void guardar(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	@Override
	@Transactional
	public void actualizar(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	@Override
	@Transactional
	public void eliminar(String cod) {
		clienteRepository.deleteById(cod);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente encontrarCliente(String cod) {
		return clienteRepository.findById(cod).orElse(null);
	}

}
