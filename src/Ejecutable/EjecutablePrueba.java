package Ejecutable;

import Dominio.Biblioteca;

import java.util.Scanner;

public class EjecutablePrueba {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba el nombre de un libro; ");
        String x= sc.nextLine();


        Biblioteca biblioteca= new Biblioteca(x);
        biblioteca.creaReserva();

        System.out.println("Escriba el libro que quiera comprar; ");
        biblioteca.vender(sc.nextLine());

    }
}
