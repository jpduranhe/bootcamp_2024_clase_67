package cl.bootcamp.clase_67.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.bootcamp.clase_67.entity.RolEntity;

@Repository
public interface RolRepository extends CrudRepository<RolEntity,Integer> {

	
	
}
