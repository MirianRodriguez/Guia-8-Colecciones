/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje04;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class PeliculaServicio {

    private ArrayList<Pelicula> peliculas = new ArrayList();

    public Pelicula crearPelicula() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Pelicula pelicula = new Pelicula();

        System.out.println("Ingrese el nombre de la pelicula: ");
        pelicula.setTitulo(leer.next());

        System.out.println("Ingrese el nombre del autor: ");
        pelicula.setAutor(leer.next());

        System.out.println("Ingrese la duracion en hs: ");
        pelicula.setDuracion(leer.nextDouble());

        return pelicula;
    }

    public void crearPeliculas() {

        Pelicula pelicula;
        Character bandera = 's';
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        do {
            System.out.println("------Carga de pelicula------");
            pelicula = crearPelicula();
            peliculas.add(pelicula);
            System.out.println("desea cargar otra pelicula? s/n");
            bandera = leer.next().charAt(0);
        } while (bandera.equals('s'));
    }

    public void mostrarPeliculas() {

        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }

    public void peliculasMasUnaHora() {
        System.out.println("Peliculas de mas de una hora: ");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.toString());
            }
        }
    }

    public void ordernarPorDuracionAsc() {
        peliculas.sort(Comparadores.compararPorDuracionAsc);
    }

    public void ordernarPorDuracionDesc() {
        peliculas.sort(Comparadores.compararPorDuracionDesc);
    }

    public void ordernarPorTitulo() {
        peliculas.sort(Comparadores.compararPorTituloAsc);
    }

    public void ordenarPorAutor() {
        peliculas.sort(Comparadores.compararPorAutorAsc);
    }

}
