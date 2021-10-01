package com.matera.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.matera.bootcamp.domain.model.Usuario;
import com.matera.bootcamp.domain.repository.UsuarioRepository;

@Service
//@RequiredArgsConstructor
public class UsuarioCrudService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
		public Page<Usuario> buscarPaginado(Pageable pageable){
			return usuarioRepository.findAll(pageable);
		}
}
