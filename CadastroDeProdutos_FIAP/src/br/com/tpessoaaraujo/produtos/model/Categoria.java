package br.com.tpessoaaraujo.produtos.model;

import java.util.Objects;

public class Categoria {
    private Long id;
    private String nomeCategoria;

    public Categoria() {
    }

    public Categoria(Long id, String nomeCategoria) {
        this.setId(id);
        this.setNomeCategoria(nomeCategoria);
    }

    public Categoria(String nomeCategoria) {
        this.setNomeCategoria(nomeCategoria);
    }

    public Long getId() {
        return id;
    }

    public Categoria setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public Categoria setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(nomeCategoria, categoria.nomeCategoria);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nomeCategoria);
    }

    @Override
    public String toString() {
        return nomeCategoria.toUpperCase();
    }
}