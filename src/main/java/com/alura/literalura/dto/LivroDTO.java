package com.alura.literalura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record LivroDTO(

        @JsonAlias("id")
        Long id_livro,
        @JsonAlias("title")
        String titulo,
        @JsonAlias("authors")
        String autor,
        @JsonAlias("languages")
        String idioma,
        @JsonAlias("download_count")
        Integer numero_download

) {
}
