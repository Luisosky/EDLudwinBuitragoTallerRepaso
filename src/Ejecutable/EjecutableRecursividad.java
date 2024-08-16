package Ejecutable;

import Dominio.Persona;

import java.util.Scanner;

public class EjecutableRecursividad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el tamaÑo de el arreglo");
        int tam = sc.nextInt();
        int [] n = new int [tam];
        int cont=1;


        for (int i = 0; i < tam; i++) {
            System.out.println("Escriba la edad de la persona número; " + cont);
            n[i] = sc.nextInt();
            cont+=1;
        }

        Persona persona = new Persona(n);

        System.out.println("Escriba la edad que desea buscar; ");
        boolean resp= persona.buscarEdad(sc.nextInt());

        if (resp) {
            System.out.println("se encontro la edad");
        }
        else {
            System.out.println("no se encontro la edad");
        }
    }

}
