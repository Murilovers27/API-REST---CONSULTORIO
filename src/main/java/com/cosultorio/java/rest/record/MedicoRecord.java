package com.cosultorio.java.rest.record;

import com.cosultorio.java.rest.entity.medico.Especialidade;

public record MedicoRecord(
        String nome,
        String email,
        String crm,
        Integer idade,
        Especialidade especialidade,
        EnderecoRecord endereco) {
}

