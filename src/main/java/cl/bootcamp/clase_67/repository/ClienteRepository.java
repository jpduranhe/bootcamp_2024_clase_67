package cl.bootcamp.clase_67.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.bootcamp.clase_67.entity.ClienteEntity;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteEntity,Integer>{

}
