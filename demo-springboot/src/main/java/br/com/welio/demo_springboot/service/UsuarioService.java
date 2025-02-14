package br.com.welio.demo_springboot.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.welio.demo_springboot.Usuario;

@Service
public class UsuarioService{
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