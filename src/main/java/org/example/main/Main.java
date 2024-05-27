package org.example.main;

import org.example.services.InterfaceGarfica;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        String valorUnitaro = "";
        String valorDesejado = "";
        InterfaceGarfica interfaceGarfica = new InterfaceGarfica();
        String menu = interfaceGarfica.menu();




        while(!busca.equalsIgnoreCase("6")) {
            System.out.println(menu);
            System.out.println("\n[ DIGITE A OPÇÃO QUE DESEJA BUSCAR: ] \n");
            busca = leitura.nextLine();



            switch(busca) {
                case "1":

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