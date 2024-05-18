package cl.bootcamp.clase_67.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.bootcamp.clase_67.entity.RolEntity;
import cl.bootcamp.clase_67.entity.UsuarioEntity;
import cl.bootcamp.clase_67.repository.RolRepository;
import cl.bootcamp.clase_67.repository.UsuarioRepository;

@Controller
@RequestMapping("/rol")
public class RolController {
	
	private final RolRepository rolRepository;
	
	public RolController(RolRepository rolRepository){
		this.rolRepository=rolRepository;
	}
	
	@GetMapping("/id/{id}")
	public ModelAndView getId(@PathVariable int id) {
		RolEntity rol= rolRepository.findById(id).get();
		
		ModelAndView mav= new ModelAndView("muestra-rol.jsp");
		mav.addObject("rl", rol);
		 return mav;
	}

}
