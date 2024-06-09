package com.alura.literalura.services;

import com.alura.literalura.dto.PageLivroDTO;
import com.alura.literalura.entity.Livro;
import com.alura.literalura.repository.LivroRepository;
import org.example.services.ConsumoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class RequestType {
    private ConsumoApi consumoApi = new ConsumoApi();

    private Scanner leitura = new Scanner(System.in);

    private String url = "http://gutendex.com/books/";

    private String search = "";

    private ConverteDados converteDados = new ConverteDados();

    private ArrayList livros = new ArrayList<>();



    public Livro buscaLivroPeloTitulo() throws IOException, InterruptedException {
        System.out.println("Digite o nome do livro: ");
        search = leitura.nextLine();

        var json = consumoApi.BuscaDados( url + "?search=" + search.replace(" ", "%20"));

        PageLivroDTO dadosConvertidos = converteDados.obterDados(json, PageLivroDTO.class);
        livros.add(dadosConvertidos);

        var lista = dadosConvertidos.results().get(0);

        Livro livro = new Livro(lista );

        return livro;

    }
}
