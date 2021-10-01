package com.matera.bootcamp.rest.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.matera.bootcamp.domain.model.ContaCorrente;
import com.matera.bootcamp.service.ConsultaContaUsuarioService;

@RestController
public class UsuarioContaCorrenteController {

	@Autowired
	private ConsultaContaUsuarioService consultaContaUsuarioService;
	
	@GetMapping("/api/v1/usuario/{id}/conta")
	public ResponseEntity<ContaCorrente> 
	buscarPorUsuario(@PathVariable Long id) {

        var contaConsultada = consultaContaUsuarioService
                .consultaContaPorUsuarioId(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(contaConsultada);
	}
}
