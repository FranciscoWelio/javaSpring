package br.com.welio.demo_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.welio.demo_springboot.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}