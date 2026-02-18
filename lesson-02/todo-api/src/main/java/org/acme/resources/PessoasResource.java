package org.acme.resources;

import io.quarkus.logging.Log;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.dto.PessoaDTO;
import org.acme.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

@Path("pessoas")
public class PessoasResource {

    List<Pessoa> pessoas = new ArrayList<>();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response criarPessoa(PessoaDTO pessoaDTO) {
        // Lógica para criar uma nova pessoa
        System.out.println("Pessoa criada: " + pessoaDTO);
        Pessoa pessoa = new Pessoa(pessoaDTO.nome(), pessoaDTO.idade(), pessoaDTO.dataNascimento(), pessoaDTO.senha());
        pessoas.add(pessoa);
        Log.info(pessoaDTO);
        return Response.status(201).header("Location", "/pessoas/" + pessoa.getNome()).entity(pessoa).build();
    }

    @GET
    public List<PessoaDTO> listarPessoas() {
        // Lógica para listar todas as pessoas
        List<PessoaDTO> pessoaDTOS = pessoas.stream()
                .map(p -> new PessoaDTO(p.getNome(), p.getIdade(), p.getDataNascimento(), p.getSenha()))
                .toList();
        return pessoaDTOS;
    }
}
