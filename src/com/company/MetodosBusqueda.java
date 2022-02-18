package com.company;

import java.util.ArrayList;
import java.util.List;

public class MetodosBusqueda {
    static List<Integer> listEnteros;

    //Se crea un numero aleatorio entre 1 y 10
    static int numeroRandom = (int)(Math.random()*10+1);

    public static void main(String[] args) {
        //Se crea el listado de numeros del 1 al 10
        listEnteros = new ArrayList<>();

        listEnteros.add(1);
        listEnteros.add(2);
        listEnteros.add(3);
        listEnteros.add(4);
        listEnteros.add(5);
        listEnteros.add(6);
        listEnteros.add(7);
        listEnteros.add(8);
        listEnteros.add(9);
        listEnteros.add(10);

        System.out.println("Metodo de busqueda Lineal");
        metodoLineal();
        System.out.println("Metodo de busqueda binaria");
        metodoBinario();

    }
    public static void metodoLineal(){
        long startTime = System.nanoTime();
        //Se busca un numero de la lista y se compara con el numero aleatorio
        //Si es igual se imprime el numero
        for (int listado : listEnteros) {
            if (listado == numeroRandom){
                System.out.println("El numero seleccionado es : " + listado);
            }
        }
        long time = System.nanoTime() - startTime;
        System.out.println("Tiempo: "+time+" Nanoseg...\n");
    }

    public static void metodoBinario(){

        long startTime = System.nanoTime();

        //Se declaran las variables y se definen
        int primero, centro, ultimo, valorCentro;

        primero= 0;

        ultimo = listEnteros.size()-1;

        while (true){
            //se busca el centro de la lista
            centro = (primero + ultimo)/2;

            valorCentro = listEnteros.get(centro);
            //System.out.println(valorCentro);

            System.out.println("Comparando " + numeroRandom + " y " + valorCentro);

            if (numeroRandom == valorCentro){
                System.out.println("El numero seleccionado esta en la posicion: " + centro);
                System.out.println("El numero es: " + listEnteros.get(centro));

                break;
            }
            else if (numeroRandom < valorCentro){
                ultimo = centro - 1;
            }else{
                primero = centro + 1;
            }
        }
        long time = System.nanoTime() - startTime;
        System.out.println("Tiempo: "+time+" Nanoseg...\n");
    }
}
