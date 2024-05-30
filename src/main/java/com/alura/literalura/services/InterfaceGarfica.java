package org.example.services;

import java.util.Scanner;

public class InterfaceGarfica {

    public String Linha(){
        String caracter = "*";
        String linha = caracter.repeat(50);
        return linha;
    }

    public String menu(){
        return Linha() +
                "\n\n Seja bem-vindo LiteraAlura! Escolha o número de sua opção\n" +
                "\n (1) Buscar livros pelo título" +
                "\n (2) Listar livros registrados" +
                "\n (3) Listar autores registrados" +
                "\n (4) Listar autores vivos em determinado ano" +
                "\n (5) Listar livros em determinado idioma" +
                "\n (6) Sair\n" +
                " Escolha uma opção válida:\n\n" +
                Linha();


    }
}
