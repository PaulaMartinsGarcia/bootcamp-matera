package com.matera.bootcamp.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matera.bootcamp.domain.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	
}
