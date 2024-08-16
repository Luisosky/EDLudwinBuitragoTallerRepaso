package Ejecutable;

import Dominio.Factura;

import java.util.Scanner;

public class EjecutableFactura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumas=0, promedio=0;
        System.out.println("Escriba el tamaño de la matriz");
        int tam= sc.nextInt();
        int cont=1;
        Factura [][] matriz= new Factura[tam][tam];

        for(int i=0; i<matriz.length;i++){

            for(int j=0; j<matriz[i].length;j++){
                System.out.println("Escriba el valor de su factura número: " + cont++);
                Factura factura= new Factura(sc.nextDouble());
                System.out.println(factura.getValorTotal());
                matriz[i][j]= factura;
            }
        }

        //Con la matriz llena

        for (Factura [] linea: matriz){
            for(Factura factura: linea){
                sumas+= factura.getValorTotal();
            }
        }

        promedio=sumas;

        System.out.println("La suma del total de facturas fueron: " + sumas + " y " + "el promedio es: " + promedio/tam);

    }
}
