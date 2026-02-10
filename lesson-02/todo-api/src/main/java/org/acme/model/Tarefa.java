package org.acme.model;

public class Tarefa {

    // atributos
    private Long id;
    private String titulo;
    private boolean concluida;

    public Long getId() {
        return id;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public Tarefa(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
