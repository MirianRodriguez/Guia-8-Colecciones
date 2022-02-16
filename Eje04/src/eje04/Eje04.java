/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje04;

/**
 *
 * @author mirod
 */
public class Eje04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio peliculaServicio = new PeliculaServicio();
        
        peliculaServicio.crearPeliculas();
        
        System.out.println("");
        System.out.println("Lista de peliculas cargadas: ");
        peliculaServicio.mostrarPeliculas();
        
        System.out.println("");
        peliculaServicio.peliculasMasUnaHora();
        
        System.out.println("");
        peliculaServicio.ordernarPorDuracionAsc();
        System.out.println("Peliculas ordenadas por duracion menor a mayor: ");
        peliculaServicio.mostrarPeliculas();
        
        System.out.println("");
        peliculaServicio.ordernarPorDuracionDesc();
        System.out.println("Peliculas ordenadas por duracion mayor a menor: ");
        peliculaServicio.mostrarPeliculas();
        
        System.out.println("");
        peliculaServicio.ordernarPorTitulo();
        System.out.println("Peliculas ordenadas por titulo: ");
        peliculaServicio.mostrarPeliculas();
        
        System.out.println("");
        peliculaServicio.ordenarPorAutor();
        System.out.println("Peliculas ordenadas por autor: ");
        peliculaServicio.mostrarPeliculas();
    }
}
