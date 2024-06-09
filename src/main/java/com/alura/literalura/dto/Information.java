package com.alura.literalura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Information(
        @JsonAlias("name")
        String nome,
        @JsonAlias("birth_year")
        Integer Anoaniversario,
        @JsonAlias("death_year")
        Integer AnoFalecimento

) {
}
