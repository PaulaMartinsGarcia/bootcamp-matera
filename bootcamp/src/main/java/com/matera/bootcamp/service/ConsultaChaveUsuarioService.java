package com.matera.bootcamp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matera.bootcamp.domain.model.Chave;
import com.matera.bootcamp.domain.repository.ChaveRepository;

@Service
public class ConsultaChaveUsuarioService {

	@Autowired
	private ChaveRepository chaveRepository;
	
	public List<Chave> consultarPorIdDeUsuario(Long id) {
        return chaveRepository.findAllByUsuarioId(id);
    }
}
