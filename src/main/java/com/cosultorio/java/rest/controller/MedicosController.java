package com.cosultorio.java.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cosultorio.java.rest.entity.medico.Medico;
import com.cosultorio.java.rest.record.MedicoRecord;
import com.cosultorio.java.rest.repository.MedicoRepo;

@RestController
@RequestMapping("medicos")

public class MedicosController {

    @Autowired
    private MedicoRepo repo;

    @PostMapping("save")
    public void salvar(@RequestBody MedicoRecord dados) {
        repo.save(new Medico(dados));
        
    }
    
}
