/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<String> razas = new ArrayList();
        String raza;
        cargarRazas(razas);
        mostrarRazas(razas);
        System.out.println("Ingrese una raza a buscar: ");
        raza = leer.next();
        buscarRaza(razas, raza);
        System.out.println("Lista ordenada");
        ordenarLista(razas);
        mostrarRazas(razas);
    }
    
    public static void cargarRazas(ArrayList<String> razas){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String raza;
        Character bandera = 's';
        do {
            System.out.println("Ingrese una raza");
            raza = leer.next();
            razas.add(raza);
            System.out.println("desea cargar otra raza? s/n");
            bandera = leer.next().charAt(0);
        }while(bandera.equals('s'));
    }
    
    public static void mostrarRazas(ArrayList<String> razas){
        for(String raza : razas){
            System.out.println(raza);
        }
    }
     
    public static void buscarRaza(ArrayList<String> razas, String raza){
        Iterator iterator = razas.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(raza)){
                iterator.remove();
                System.out.println("Se ha eliminado el elemento buscado");
            }
            
        }
    }
    
    public static void ordenarLista(ArrayList<String> razas){
        Collections.sort(razas);
    }
    
}
