package cl.bootcamp.clase_67.service;

import java.util.List;

import cl.bootcamp.clase_67.model.Cliente;

public interface ClienteService {
	
	
	int crear(Cliente cliente);
	boolean editar(Cliente cliente);
	Cliente getById(int id);
	List<Cliente> listado();


}
