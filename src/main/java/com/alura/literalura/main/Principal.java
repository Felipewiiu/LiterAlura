package com.alura.literalura.main;

import com.alura.literalura.repository.LivroRepository;
import org.example.services.ConsumoApi;
import org.example.services.InterfaceGarfica;

import java.io.IOException;
import java.util.Scanner;


public class Principal {

       private Scanner leitura = new Scanner(System.in);
       private String busca = "";
       private InterfaceGarfica interfaceGarfica = new InterfaceGarfica();
       private String menu = interfaceGarfica.menu();
       private ConsumoApi consumoApi = new ConsumoApi();
       private String url_str = "http://gutendex.com/books/";
       private LivroRepository repository;

       public Principal(LivroRepository repository) {
           this.repository = repository;
       }


       public void exibeMenu() throws IOException, InterruptedException {

           while(!busca.equalsIgnoreCase("6")) {
               System.out.println(menu);
               System.out.println("\n[ DIGITE A OPÇÃO QUE DESEJA BUSCAR: ] \n");
               busca = leitura.nextLine();



               switch(busca) {
                   case "1":
                       var d = consumoApi.BuscaDados(url_str);
                       System.out.println(d);
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