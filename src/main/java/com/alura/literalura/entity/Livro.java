package com.alura.literalura.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "livro")
@Table(name = "tb_livro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "{id}")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_livro;

    private String titulo;

    private String autor;

    private String idioma;

    private Integer numero_download;
}
