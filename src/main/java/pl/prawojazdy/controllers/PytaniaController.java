package pl.prawojazdy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.prawojazdy.Services.IPytaniaService;
import pl.prawojazdy.model.Pytania;

@Controller
public class PytaniaController {
	
	@Autowired
	IPytaniaService pytaniaService;
	
	@RequestMapping("/showPytania")
	public String findPytania(Model model) {
		
		List<Pytania> pytania = (List<Pytania>) pytaniaService.findAll();
		
		model.addAttribute("pytania", pytania);
		return "showPytania";
	}
}
