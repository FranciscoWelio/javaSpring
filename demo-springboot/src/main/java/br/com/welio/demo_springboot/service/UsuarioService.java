package br.com.welio.demo_springboot.service;

import java.util.Optional;


import org.springframework.stereotype.Service;

import br.com.welio.demo_springboot.entity.Usuario;
import br.com.welio.demo_springboot.exception.UsuariosException;
import br.com.welio.demo_springboot.repository.UsuarioRepository;

@Service
public class UsuarioService{
	UsuarioRepository usuarioRepository;

    public Usuario addUsuario(Usuario usuario){
        boolean jaExiste = usuarioRepository.existsById(usuario.getId());

		if(jaExiste==true){
			throw new UsuariosException("Usuário Cadastrado");
		}
		usuario = usuarioRepository.save(usuario);

        return usuario;
    }

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public Optional<Usuario> getUsuario(Long id){
		return usuarioRepository.findById(id);
	}
}

