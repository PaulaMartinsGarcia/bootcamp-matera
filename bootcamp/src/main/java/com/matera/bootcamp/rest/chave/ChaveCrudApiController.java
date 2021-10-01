package com.matera.bootcamp.rest.chave;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.matera.bootcamp.domain.model.Chave;
import com.matera.bootcamp.service.chave.ChaveCrudService;

@RestController
public class ChaveCrudApiController {

	@Autowired
	private ChaveCrudService chaveCrudService;
	
	@PostMapping("/api/v1/chave")
    public ResponseEntity<Chave> cadastrarChave(@RequestBody Chave chave) {

        if(chave.getId() != null)
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .build();

        var chaveCadastrada = chaveCrudService
                .cadastrarChave(chave);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(chaveCadastrada);
    }
	
	@PutMapping("/api/v1/chave")
    public ResponseEntity<Chave> atualizarChave(@RequestBody Chave chave) {

        if(chave.getId() == null)
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .build();

        var chaveCadastrada = chaveCrudService
                .cadastrarChave(chave);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(chaveCadastrada);
    }
}
