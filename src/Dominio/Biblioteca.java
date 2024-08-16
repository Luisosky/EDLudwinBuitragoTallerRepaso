package Dominio;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Biblioteca extends Negocio implements Reservas {

    private final String [] librosReserva= {"El gato negro","Picnic extraterrestre","Sombras de nadie","Crimen y castigo"};
    public final Scanner SC= new Scanner(System.in);
    private Date fechaVenta;

    private String nombreLibro;

    public Biblioteca(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    @Override
    public void vender(String libro) {
        this.fechaVenta = new Date();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fecha = formato.format(fechaVenta);
        System.out.println("Se vendio este libro " + libro + " en la fecha " + fecha);

    }

    @Override
    public void creaReserva() {
        boolean bandera=true;
       for (int i=0; i<librosReserva.length && bandera; i++ ){
           if(librosReserva[i].equalsIgnoreCase(nombreLibro)){
               System.out.println("Este libro ya esta reservado/no se puede generar la reserva");
               bandera=false;
           }
       }
        System.out.println("Se pudo crear la reserva");
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }



}
