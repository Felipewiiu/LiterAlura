package com.alura.literalura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LivroDTO(

        @JsonAlias("id")
        Long id_livro,
        @JsonAlias("title")
        String titulo,
        @JsonAlias("authors")
        List <Information> autor,
        @JsonAlias("languages")
        List <String> idiomas,
        @JsonAlias("download_count")
        Integer numero_download

) {
}
