package com.matera.bootcamp.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matera.bootcamp.domain.model.ContaCorrente;

public interface ContaCorrenteRepository extends JpaRepository<ContaCorrente, Long>{

	Optional<ContaCorrente> findByUsuarioId(Long id);
}
