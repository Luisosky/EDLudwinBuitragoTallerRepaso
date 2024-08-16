package Dominio;

public class Persona {

    int [] edades;

    public Persona(int [] edades) {
        this.edades = edades;
    }

    public void metodoBurbuja(){
        int n = edades.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(edades[j]<edades[j+1]){
                    int temp = edades[j];
                    edades[j] = edades[j+1];
                    edades[j+1] = temp;
                }
            }
        }

    }

    public boolean buscarEdad(int edad){
        metodoBurbuja();
        return buscarEdadRecursivo(edad, 0, edades.length-1);
    }

    private boolean buscarEdadRecursivo(int edad, int inicio, int fin){
        if (inicio>fin){
            return false;
        }

        int medio = inicio+(fin-inicio)/2;

        if (edades[medio]==edad){
            return true;
        }

        if (edades[medio]>edad){
            return buscarEdadRecursivo(edad,inicio,medio-1);
        }else{
            return buscarEdadRecursivo(edad,medio+1,fin);
        }
    }
}
