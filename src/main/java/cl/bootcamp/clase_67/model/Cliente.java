package cl.bootcamp.clase_67.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

	private int id;
	private String nombre;
	private String apellidos;
	private String email;
}
