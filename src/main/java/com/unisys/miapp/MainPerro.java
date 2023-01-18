package com.unisys.miapp;

public class MainPerro {
    public static void main(String[] args) {
        Perro toby=new Perro("toby","Terrier");
        Perro otto=new Perro("Otto","Pastor Aleman");
        Perro fluky =new Perro("lucky","Pastor de aguas");

        System.out.println(toby.getNombre()+toby.getRaza());
        fluky.setRaza("Perro salchicha");
        System.out.println(fluky.toString());
    }
}
