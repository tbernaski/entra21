package com.entra21.primeiroprojetospring.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "livro")
@PrimaryKeyJoinColumn(name = "id_item", referencedColumnName = "id")
public class LivroEntity extends ItemEntity {

    @Column(name = "autor")
    private String autor;

    @Column(name = "qtida_paginas")
    private Integer qtidaPaginas;

    @Column(name = "ano_publicacao")
    private Integer anoPublicacao;

    @Column(name = "edicao")
    private Integer edicao;

}
