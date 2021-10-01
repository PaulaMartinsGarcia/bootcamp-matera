package com.matera.bootcamp.rest.usuario;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.matera.bootcamp.domain.model.Usuario;
import com.matera.bootcamp.service.UsuarioCrudService;

@RestController
//@RequiredArgsConstructor
public class UsuarioCrudApiController{
	
	@Autowired
	private UsuarioCrudService usuarioCrudService;
	
	@PostMapping("/api/v1/usuario")
	public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario, 
			              HttpServletRequest httpRequest, 
			              HttpServletResponse httpResponse) {
		
		
		var ehUmNovoUsuario = usuario.getId() == null;
		
		var usuarioSalvo = usuarioCrudService.salvar(usuario);
		
		return ResponseEntity.status(ehUmNovoUsuario ? HttpStatus.CREATED : HttpStatus.OK).body(usuarioSalvo);
		
	}
	
	@GetMapping("/api/v1/usuario")
	public ResponseEntity<Page<Usuario>> buscarPaginado(Pageable pageable) {
		var paginaUsuarios = usuarioCrudService.buscarPaginado(pageable);
		
		return ResponseEntity.status(HttpStatus.OK).body(paginaUsuarios);
    }
}
