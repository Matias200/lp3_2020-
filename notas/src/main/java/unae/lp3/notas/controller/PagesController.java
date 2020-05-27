package unae.lp3.notas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="pagina")
public class PagesController {
	@RequestMapping (value="index", method=RequestMethod.GET)
	public String goIndex(Model datos) {
		
		String titulo="pages/index";
		datos.addAttribute("titulo",titulo);
		
		return "pages/index";
	}
	@RequestMapping(value="saludo/{nombre}/{apellido}", method=RequestMethod.GET)
	public String goSaludo(Model datos, @PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido) {
		datos.addAttribute("nombre",nombre);
		datos.addAttribute("apellido",apellido);
	
		return "pages/saludos";
}

}
