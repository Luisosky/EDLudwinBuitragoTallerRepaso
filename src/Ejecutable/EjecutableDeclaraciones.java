package Ejecutable;

import java.util.Arrays;

public class EjecutableDeclaraciones {

    public static void declararNumerosEnteros(){
        int a=5, b=10, c=15, d=20;
        System.out.println("La multiplicación de enteros es; " + a + " * " + b + " * " + c + " * " + d + " =" + (a*b*c*d));
    }

    public static void declararNumerosDecimales(){
        float a=1.5f, b=2.5f;
        double c=12.5, d=14.8;
        System.out.println("La multiplicación de decimales es; " + a + " * " + b + " * " + c + " * " + d + " =" + (a*b*c*d));
    }

    public static void declararTextos(){
        char a= 'A',b= 'B';
        String c="Ying", d="Yang";
        System.out.println("Los caracteres son: " + a + " y " + b + '\n' + " y los strings son: " + c + " y " + d);
    }

    public static void declararArreglos(){
        int [] enteros= {1,2,3};
        long []longs= {100,200,300};
        char [] caracteres= {'A','B','C'};
        String [] strings= {"Scorpion evo","MP7","Kriss Vector"};

        System.out.println("Números enteros: " + Arrays.toString(enteros) + '\n' + " arreglo de longs" + Arrays.toString(longs) + '\n' + " arreglo de caracteres" + Arrays.toString(caracteres) + '\n' + " arreglo de strings" + Arrays.toString(strings));
    }

    public static void main(String[] args) {
        declararNumerosEnteros();
        declararNumerosDecimales();
        declararTextos();
        declararArreglos();
    }
}
