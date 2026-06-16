package com.cosultorio.java.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosultorio.java.rest.entity.medico.Medico;

public interface MedicoRepo extends JpaRepository<Medico, Long>{
    
}
