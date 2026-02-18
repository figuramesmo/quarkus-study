package org.acme.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record PessoaDTO(
        @JsonProperty("nome_completo")
        String nome,
        int idade,
        @JsonProperty("data_nascimento")
        @JsonFormat(pattern = "dd/MM/yyyy")
        LocalDate dataNascimento,
        @JsonIgnore
        String senha
) {
}
