/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Eje03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        AlumnoServicio alumnoServicio = new AlumnoServicio();

        alumnoServicio.crearAlumnos();

        System.out.println("-----------------------");
        System.out.println("Alumnos cargados: ");
        alumnoServicio.mostrarAlumnos();

        System.out.println("-----------------------");
        String nombreAlumno;
        System.out.println("Ingrese el nombre del alumno que desea calcular la nota final: ");
        nombreAlumno = leer.next();

        Alumno alumnoEncontrado = alumnoServicio.buscarAlumno(nombreAlumno);

        if (alumnoEncontrado != null) {
            System.out.println("La nota final es: " + alumnoServicio.notaFinal(alumnoEncontrado));
        } else {
            System.out.println("No se encontro el alumno.");
        }

    }
}
