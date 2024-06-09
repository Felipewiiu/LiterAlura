package com.alura.literalura.entity;

import com.alura.literalura.dto.LivroDTO;
import com.alura.literalura.dto.PageLivroDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "livro")
@Table(name = "tb_livro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "{id}")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_livro;

    private String titulo;

    private String nome;

    private String anoAniversario;

    private String anoFalecimento;

    private String idioma;

    private Integer numero_download;


    public Livro(LivroDTO lista) {
        this.titulo = lista.titulo();
        this.nome = String.valueOf(lista.autor().get(0).nome());
        this.anoAniversario = String.valueOf(lista.autor().get(0).Anoaniversario());
        this.anoFalecimento = String.valueOf(lista.autor().get(0).AnoFalecimento());
        this.idioma = lista.idiomas().toString();
        this.numero_download = lista.numero_download();
    }

    @Override
    public String toString() {
        return "\n\n***** Livro ******\n" +
                "\nid_livro: " + id_livro +
                "\ntitulo: " + titulo +
                "\nnome: " + nome +
                "\nanoAniversario: " + anoAniversario +
                "\nanoFalecimento: " + anoFalecimento +
                "\nidioma: " + idioma  +
                "\nnumero_download: " + numero_download +
                "\n\n*******************\n";
    }
}
