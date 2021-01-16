package cl.awakelab.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String ppal() {
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
