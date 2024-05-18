package cl.bootcamp.clase_67.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cl.bootcamp.clase_67.entity.ClienteEntity;
import cl.bootcamp.clase_67.model.Cliente;
import cl.bootcamp.clase_67.repository.ClienteRepository;
import cl.bootcamp.clase_67.service.ClienteService;
import lombok.extern.apachecommons.CommonsLog;

@Service
@CommonsLog
public class ClienteServiceImpl implements ClienteService {
	
	ClienteRepository clienteRepository;
	
	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository=clienteRepository;
	}

	@Override
	public int crear(Cliente cliente) {
		try {
			ClienteEntity clienteEntity= new ClienteEntity();
			clienteEntity.setNombre(cliente.getNombre());
			clienteEntity.setApellidos(cliente.getApellidos());
			clienteEntity.setEmail(cliente.getEmail());
			
			ClienteEntity clienteEntitySaved= clienteRepository.save(clienteEntity);
			
			int idCliente= clienteEntitySaved.getId();
			log.info("Cliente guardado en la bd con el id:"+idCliente);
			return idCliente;
			
		}catch(Exception ex) {
			log.error("Error al Guardar el cliente" );
			return 0;
		}
		
	}

	@Override
	public boolean editar(Cliente cliente) {
		
		try {
			//clienteDao.update(cliente);
			return true;
			
		}catch(Exception ex) {
			log.error("Error al Editar el cliente" );
			return false;
		}
	}

	@Override
	public Cliente getById(int id) {

		
		try {
			Optional<ClienteEntity> resp = clienteRepository.findById(id);
			 
			  if(resp.isPresent()) {
				  ClienteEntity entity=resp.get();
				  
				  Cliente cliente = new Cliente();
				  cliente.setId(entity.getId());
				  cliente.setNombre(entity.getNombre());
				  cliente.setApellidos(entity.getApellidos());
				  cliente.setEmail(entity.getEmail());
				  return cliente;
			  }
			  return null;
			
		}catch(Exception ex) {
			log.error("Error al obtener el cliente" );
			return null;
		}
	}

	@Override
	public List<Cliente> listado() {
		
		try {
			
			List<Cliente> clientes= new ArrayList<>();
			
			Iterable<ClienteEntity> lisEntities =  clienteRepository.findAll();
			
			for(ClienteEntity entity : lisEntities) {
				
				Cliente cliente = new Cliente();
				  cliente.setId(entity.getId());
				  cliente.setNombre(entity.getNombre());
				  cliente.setApellidos(entity.getApellidos());
				  cliente.setEmail(entity.getEmail());
				clientes.add(cliente);
			}
			return clientes;
			
		}catch(Exception ex) {
			log.error("Error al obtener el cliente" );
			return null;
		}
	}

}
