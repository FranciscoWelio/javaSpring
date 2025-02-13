package br.com.welio.demo_springboot.controller;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.welio.demo_springboot.Usuario;

@RestController
@RequestMapping("/usuario")
class UsuarioController{
	UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@GetMapping("/{id}")
	public Usuario getDemo(@PathVariable("id") Long id) {
		return usuarioService.getUsuario(id).orElse(null);
	}
	
}

@Service
class UsuarioService{
	UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public Optional<Usuario> getUsuario(Long id){
		return usuarioRepository.findById(id);
	}
}

interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}