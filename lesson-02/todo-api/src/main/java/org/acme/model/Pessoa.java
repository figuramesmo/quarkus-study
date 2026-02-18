package org.acme.model;

import java.time.LocalDate;

public class Pessoa {

    String nome;
    int idade;
    LocalDate dataNascimento;
    String senha;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, LocalDate dataNascimento, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getSenha() {
        return senha;
    }
}
