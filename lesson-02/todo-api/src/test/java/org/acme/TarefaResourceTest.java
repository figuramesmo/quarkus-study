package org.acme;

import org.acme.dto.CriarTarefaDTO;
import org.acme.resources.TarefaResource;
import org.junit.jupiter.api.Test;

class TarefaResourceTest {

    @Test
    void criaTarefa(){
        TarefaResource tarefaResource = new TarefaResource();
        CriarTarefaDTO estudar =  new CriarTarefaDTO("Minha primeira tarefa");
        tarefaResource.criarTarefa(
               estudar
        );
    }

}