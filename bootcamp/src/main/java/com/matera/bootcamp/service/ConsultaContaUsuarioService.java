package com.matera.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matera.bootcamp.domain.model.ContaCorrente;
import com.matera.bootcamp.domain.repository.ContaCorrenteRepository;

@Service
public class ConsultaContaUsuarioService {

	@Autowired
	private ContaCorrenteRepository contaCorrenteRepository;
	
	public ContaCorrente consultaContaPorUsuarioId(Long id) {
		return contaCorrenteRepository.findByUsuarioId(id)
				.orElse(null);
	}
	
}
