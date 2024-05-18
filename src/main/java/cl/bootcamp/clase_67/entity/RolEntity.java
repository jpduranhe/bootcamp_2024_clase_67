package cl.bootcamp.clase_67.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="rol")
@Data
public class RolEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String nombre;
	
	@OneToMany(mappedBy="rol")	
	List<UsuarioEntity> usuarios;
}
