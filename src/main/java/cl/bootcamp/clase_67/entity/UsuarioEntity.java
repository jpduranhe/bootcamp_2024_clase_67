package cl.bootcamp.clase_67.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="usuario")
@Data
public class UsuarioEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	private String usuario;
	private String clave;
	private String activo;
	
	@OneToOne
	@JoinColumn(name="cliente_id")
	private ClienteEntity cliente;
	
	@ManyToOne
	@JoinColumn(name="id_role")
	private RolEntity rol;
	
}
