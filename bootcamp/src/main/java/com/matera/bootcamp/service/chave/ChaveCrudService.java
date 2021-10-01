package com.matera.bootcamp.service.chave;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.matera.bootcamp.domain.model.Chave;
import com.matera.bootcamp.domain.repository.ChaveRepository;
import com.matera.bootcamp.domain.repository.ContaCorrenteRepository;

@Service
public class ChaveCrudService {

	@Autowired
	private ChaveRepository chaveRepository;
	
	@Autowired
	private ContaCorrenteRepository contaCorrenteRepository;

    public Chave cadastrarChave(Chave chave) {
    	
    	if(chave.getContaCorrente().getId() == null)
    		
    		throw new RuntimeException("Chave precisa de uma conta corrente");
        
    	var contaCorrente = contaCorrenteRepository
                .findById(chave.getContaCorrente().getId())
                .orElseThrow(() -> new RuntimeException("Conta corrente n�o encontrada"));
    			
    	chave.setContaCorrente(contaCorrente);
    	return chaveRepository.save(chave);
    }
    
    public Page<Chave> buscarPaginado(Pageable pageable) {
    	return chaveRepository.findAll(pageable);
    }
}
