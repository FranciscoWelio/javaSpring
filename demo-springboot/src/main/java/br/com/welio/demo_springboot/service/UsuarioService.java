package br.com.welio.demo_springboot.service;

import java.util.Optional;


import org.springframework.stereotype.Service;

import br.com.welio.demo_springboot.Usuario;
import br.com.welio.demo_springboot.repository.UsuarioRepository;

@Service
public class UsuarioService{
	UsuarioRepository usuarioRepository;

    public Usuario addUsuario(Usuario usuario){
        boolean jaExiste = usuarioRepository.existsById(usuario.getId());

		if(jaExiste==true){
			
		}
        return usuario;
    }

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public Optional<Usuario> getUsuario(Long id){
		return usuarioRepository.findById(id);
	}
}

