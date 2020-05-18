package br.com.qintess.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.qintess.api.service.UsuarioService;

@Controller
public class HomeController {
	@Autowired
	UsuarioService service;
	
	@GetMapping({"/","/home"})
	public String home() {
		return "/home";
		
	}
	
	//Abrir página login
	@GetMapping("/login")
	public String login() {
		
		return "/login";
		
	}
	
	
	//Login inválido
	@GetMapping("/login-error")
	public String loginError(ModelMap model) {
		model.addAttribute("Alerta", "Erro");
		model.addAttribute("titulo", "Credenciais inválidas!");
		model.addAttribute("texto", "Login ou senha incorretos, tente novamente.");
		model.addAttribute("subtexto", "Acesso permitido apenas para cadastros já ativados. ");
		
		return "/login";
		
	}

	


	
	
}
