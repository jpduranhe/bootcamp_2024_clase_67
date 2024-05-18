package cl.bootcamp.clase_67.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.bootcamp.clase_67.model.Cliente;
import cl.bootcamp.clase_67.service.ClienteService;


@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	
private final ClienteService clienteService;
	

	
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping("/form")
	public ModelAndView formGet(@RequestParam(defaultValue="0") int error ) {
		
		return new ModelAndView("formulario-cliente.jsp");
	}
	
	@PostMapping("/form")
	public ModelAndView formPost(@ModelAttribute Cliente cliente) {
		
		int resultado= clienteService.crear(cliente);
		String view="formulario-cliente.jsp";
		
		if(resultado == 0) {
			view="redirect:/cliente/form?error=1";
		}
		return new ModelAndView(view);
	}
	
	@GetMapping("/id/{id}")
	public ModelAndView proIdGet(@PathVariable int id) {
		Cliente cliente=clienteService.getById(id);
		ModelAndView modelAndView= new ModelAndView("muestra-cliente.jsp");
		modelAndView.addObject("cli", cliente);
		 return modelAndView;
	}
	@GetMapping("/list")
	public ModelAndView listGet() {
		List<Cliente> clienteList=clienteService.listado();
		
		ModelAndView modelAndView= new ModelAndView("muestra-cliente_list.jsp");
		modelAndView.addObject("list", clienteList);
		 return modelAndView;
	}

}
