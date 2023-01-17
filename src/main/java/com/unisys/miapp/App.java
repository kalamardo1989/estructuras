package com.unisys.miapp;

public class App {
    public static void main(String[] args) {

        System.out.println("Bucle while hasta 10");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("Bucle DO while hasta 10");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);


        System.out.println("Bucle For hasta 10");
        int z;
        for (z = 0; z < 10;z++)
            System.out.println(z);


        int edadPersona=21;
                if (edadPersona<18){
                    System.out.println("Edad "+edadPersona+" No puede condiducir");
                }else{
                    System.out.println("Edad "+edadPersona+" Puede condiducir");
                }

        switch(edadPersona) {
            case 18:
                System.out.println("Puede conducir");
                break;
            case 21:
                System.out.println("Puede beber en USA");
                break;
            default:
                System.out.println("Su edad es:" + edadPersona);
                break;
        }

        i=0;
        System.out.println("Entrada al bucle while");
        while(i<10) {
            i++;
            switch (i) {
                case 2:
                    continue;
                case 5:
                    break;
            }
        }
    }
}


