package com.matera.bootcamp.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matera.bootcamp.domain.model.Chave;

public interface ChaveRepository extends JpaRepository<Chave, Long> {

}
