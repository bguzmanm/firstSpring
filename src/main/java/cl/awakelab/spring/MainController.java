package cl.awakelab.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.model.Estudiante;

@Controller
public class MainController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String ppal(Model model) {
		
		//armo lista de datos que voy a mostrar.
		List<Estudiante> lista = new ArrayList<Estudiante>();
		lista.add(new Estudiante(0, "Yossie"));
		lista.add(new Estudiante(1, "Javiera"));
		lista.add(new Estudiante(2, "Gustavo"));
		
		//y la paso como atributo de model
		model.addAttribute("lista", lista);
		
		return "index";
		
		
		
	}
	
	@RequestMapping(value="/Caracteristicas", method=RequestMethod.GET)
	public String caracteristicas() {
		return "caracteristicas";
	}
	
	@RequestMapping(value="/Precios", method = RequestMethod.GET)
	public String precios() {
		return "precios";
	}
	
}
