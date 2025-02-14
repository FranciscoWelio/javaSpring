package br.com.welio.demo_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.welio.demo_springboot.Usuario;
import br.com.welio.demo_springboot.service.UsuarioService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/usuario")
class UsuarioController{
	UsuarioService usuarioService;

	@PostMapping
	public Usuario addUsuario(@RequestBody Usuario usuario) {
		
		return usuario;
	}
	
	
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@GetMapping("/{id}")
	public Usuario getDemo(@PathVariable("id") Long id) {
		return usuarioService.getUsuario(id).orElse(null);
	}
	
}


