package com.alura.literalura.main;

import com.alura.literalura.dto.LivroDTO;
import com.alura.literalura.dto.PageLivroDTO;
import com.alura.literalura.entity.Livro;
import com.alura.literalura.repository.LivroRepository;
import com.alura.literalura.services.ConverteDados;
import com.alura.literalura.services.RequestType;
import lombok.RequiredArgsConstructor;
import org.example.services.ConsumoApi;
import org.example.services.InterfaceGarfica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;


@RequiredArgsConstructor
public class Principal {

       private Scanner leitura = new Scanner(System.in);
       private String busca = "";
       private InterfaceGarfica interfaceGarfica = new InterfaceGarfica();
       private String menu = interfaceGarfica.menu();
       private RequestType request = new RequestType();
       private final LivroRepository livroRepository;






       public void exibeMenu() throws IOException, InterruptedException {

           while(!busca.equalsIgnoreCase("6")) {
               System.out.println(menu);
               System.out.println("\n[ DIGITE A OPÇÃO QUE DESEJA BUSCAR: ] \n");
               busca = leitura.nextLine();




               switch(busca) {
                   case "1":
                       var livro = request.buscaLivroPeloTitulo();
                       System.out.println(livro);

                       livroRepository.save(livro);
                       break;
                   case "2":

                       break;
                   case "3":

                       break;
                   case "4":

                       break;
                   case "5":

                       break;
                   case "6":

                       break;
                   default:
               }

           }
       }







}