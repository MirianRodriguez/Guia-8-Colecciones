/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje04;

import java.util.Comparator;

/**
 *
 * @author mirod
 */
public class Comparadores {

    public static Comparator<Pelicula> compararPorDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };

    public static Comparator<Pelicula> compararPorDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };

    public static Comparator<Pelicula> compararPorTituloAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };

    public static Comparator<Pelicula> compararPorAutorAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getAutor().compareTo(p2.getAutor());
        }
    };
}
