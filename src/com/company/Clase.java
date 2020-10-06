package com.company;

public class Clase {

    String clase1;
    int clase2;
    int clase3;

    public void Clase(){
        this.clase1 = clase1;
        this.clase2 = clase2;
        this.clase3= clase3;

    }

    public void claseToString(){

        String terminado = "La clase 1 y 2 no se pueden sumar porque tienen variables diferentes";

        System.out.println("Ahora si que si: "+ terminado);
       // habia que hacer unos cambios porque no funcionaba el codigo
    }
    public void sumaClases(){
        int laSuma = clase2 + clase3;
        System.out.println("La suma de las dos clases es "+ laSuma);
    }
     public void restaClase(int clase2, int clase3){
         int laResta = clase2 - clase3;

         System.out.println("La resta de los 2 numeros es "+ laResta);
     }

}
