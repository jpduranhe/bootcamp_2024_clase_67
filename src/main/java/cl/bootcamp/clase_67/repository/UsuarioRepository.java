package cl.bootcamp.clase_67.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.bootcamp.clase_67.entity.UsuarioEntity;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioEntity,Integer> {

}
