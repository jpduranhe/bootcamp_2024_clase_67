package cl.bootcamp.clase_67.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.bootcamp.clase_67.entity.UsuarioEntity;
import cl.bootcamp.clase_67.repository.UsuarioRepository;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	private final UsuarioRepository usuarioRepository;
	
	public UsuarioController(UsuarioRepository usuarioRepository){
		this.usuarioRepository=usuarioRepository;
	}
	
	@GetMapping("/id/{id}")
	public ModelAndView getId(@PathVariable int id) {
		UsuarioEntity us= usuarioRepository.findById(id).get();
		
		ModelAndView mav= new ModelAndView("muestra-usuario.jsp");
		mav.addObject("usu", us);
		 return mav;
	}

}
