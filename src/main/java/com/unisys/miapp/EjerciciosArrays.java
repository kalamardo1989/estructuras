package com.unisys.miapp;

import java.util.Arrays;

public class EjerciciosArrays {
    public static void main(String[] args) {
        int [] arrayEnteros= new int [4];
        int i;
        Arrays.fill(arrayEnteros,0);

        /* Ejerciio 6   */
        System.out.println("Bucle for: ");
        for(i=0;i<arrayEnteros.length;i++){
            System.out.println("Posicion array "+i+" ="+arrayEnteros[i]);
        }
        /* Ejerciio 7       */
        i=0;
        System.out.println("Bucle While: ");
        while (i<arrayEnteros.length){
            System.out.println("Posicion array "+i+" ="+arrayEnteros[i]);
            i++;
        }

        /* Ejerciio 8       */
        System.out.println("Bucle Do While: ");
        i=0;
        do {
            System.out.println("Posicion array "+i+" ="+arrayEnteros[i]);
            i++;
        }while ((i<arrayEnteros.length));
        /* Ejerciio 9 y 10       */
        float [] flotantes=new float[2000];
        Arrays.fill(flotantes,0);
        flotantes[2]=7.3f;
        System.out.println("Valor posicion 2 por pantalla: "+flotantes[2]);
        System.out.println("Elementos del array flotantes:"+flotantes.length);


    }
}
