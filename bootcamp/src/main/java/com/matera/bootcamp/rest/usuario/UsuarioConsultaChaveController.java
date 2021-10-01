package com.matera.bootcamp.rest.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.matera.bootcamp.domain.model.Chave;
import com.matera.bootcamp.service.ConsultaChaveUsuarioService;

@RestController
public class UsuarioConsultaChaveController {

	@Autowired
	private ConsultaChaveUsuarioService consultaChaveUsuarioService;
	
	@GetMapping("/api/v1/usuario/{id}/chaves")
	public ResponseEntity<List<Chave>> consultaChave(@PathVariable Long id) {
        var chavesDoUsuario = consultaChaveUsuarioService
                .consultarPorIdDeUsuario(id);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(chavesDoUsuario);
    }
	
}
