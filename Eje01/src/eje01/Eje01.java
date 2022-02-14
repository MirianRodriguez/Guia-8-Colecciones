/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje01;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList();
        cargarRazas(razas);
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
    
}
