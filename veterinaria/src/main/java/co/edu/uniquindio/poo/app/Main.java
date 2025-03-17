package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Mascota;
import co.edu.uniquindio.poo.model.Veterinaria;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static  void main (String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota");
        String especie = ("perro");
        String raza =  ("pincher");
        byte edad = (4);
        String genero = ("M");
        String color = ("cafe");
        float peso = (3.5F);
        String frase = "Mascota de Daniela";

        Veterinaria veterinaria = new Veterinaria();




        Scanner scan = new Scanner(frase);




        JOptionPane.showMessageDialog(null, "nombre: "+ nombre + " \nespecie: "+ especie + " \nraza: "+ raza + " \nedad: " + edad + " \ngenero: " + genero + " \ncolor: " + color + " \npeso: " + peso);
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());


    }}