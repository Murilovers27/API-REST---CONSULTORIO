package com.cosultorio.java.rest.entity.medico.endereco;

import com.cosultorio.java.rest.record.EnderecoRecord;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(EnderecoRecord dados){
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.logradouro = dados.logradouro();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.complemento = dados.complemento();
    }

}
