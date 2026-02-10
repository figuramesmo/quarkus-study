package org.acme.resources;

/**
 * Classe responsável por:
 * - criar
 * - deletar
 * - atualizar
 * tarefas
 */

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.acme.dto.CriarTarefaDTO;
import org.acme.model.Tarefa;
import org.jboss.resteasy.reactive.ResponseStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Path(value = "/tarefas")
public class TarefaResource {

    private static final List<Tarefa> LISTA_DE_TAREFAS = new ArrayList<>();
    private AtomicLong incrementador = new AtomicLong(0);

    // metodos, comportamentos
    @POST
    @ResponseStatus(201)
    public void criarTarefa(CriarTarefaDTO tarefa) {

        System.out.println("Recebi uma tarefa:" + tarefa);
        Tarefa minhaTarefa = new Tarefa(incrementador.incrementAndGet(), tarefa.titulo());
        LISTA_DE_TAREFAS.add(minhaTarefa);

    }

    @GET
    public List<Tarefa> listaTarefas() {
        return LISTA_DE_TAREFAS;
    }
}
