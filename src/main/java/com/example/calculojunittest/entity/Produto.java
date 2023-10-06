package com.example.calculojunittest.entity;

import com.example.calculojunittest.enums.EnumProdutoStatus;

public class Produto {
    private Integer id;
    
    private String titulo;

    private String descricao;

    private Double preco;

    private EnumProdutoStatus status;

    public Produto() {

    }

    public Produto(String titulo, String descricao, Double preco, EnumProdutoStatus status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public EnumProdutoStatus getStatus() {
        return status;
    }

    public void setStatus(EnumProdutoStatus status) {
        this.status = status;
    }
}
