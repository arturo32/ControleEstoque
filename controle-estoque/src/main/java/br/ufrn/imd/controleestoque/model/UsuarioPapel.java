package br.ufrn.imd.controleestoque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class UsuarioPapel {

    @ManyToOne
    private Usuario usuario;


    @ManyToOne
    private Papel papel;
}
