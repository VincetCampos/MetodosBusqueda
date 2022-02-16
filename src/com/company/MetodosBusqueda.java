package com.company;

import java.util.ArrayList;
import java.util.List;

public class MetodosBusqueda {

    public static void main(String[] args) {
        System.out.println("Metodo de busqueda Lineal");
        metodoLineal();

    }

    public static void metodoLineal(){
        //Se crea el listado de numeros
        List<Integer> listEnteros = new ArrayList<>();

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

        //Se crea un numero aleatorio entre 1 y 10
        int numeroRandom = (int)(Math.random()*10+1);

        //Se busca un numero de la lista y se compara con el numero aleatorio
        //Si es igual se imprime el numero
        for (int listado : listEnteros) {
            if (listado == numeroRandom){
                System.out.println("El numero seleccionado es: " + listado);
            }
        }
    }
}
