/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje03;

import java.util.ArrayList;
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
        ArrayList<Alumno> alumnos = new ArrayList();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        AlumnoServicio alumnoServicio = new AlumnoServicio();
        Alumno alumno;
        Character bandera = 's';
        do {
            System.out.println("------Carga de alumno------");
            alumno = alumnoServicio.crearAlumno();
            alumnos.add(alumno);
            System.out.println("desea cargar otro alumno? s/n");
            bandera = leer.next().charAt(0);
        }while(bandera.equals('s'));
        
        System.out.println("-----------------------");
        System.out.println("Alumnos cargados: ");
        alumnoServicio.mostrarAlumnos(alumnos);
        
        System.out.println("-----------------------");
        String nombreAlumno;
        System.out.println("Ingrese el nombre del alumno que desea calcular la nota final: ");
        nombreAlumno = leer.next();
        
        Alumno alumnoEncontrado = buscarAlumno(alumnos, nombreAlumno);
        //System.out.println("se encontro " + alumnoEncontrado.toString());
        
        if ( alumnoEncontrado != null){
            System.out.println("La nota final es: " + alumnoServicio.notaFinal(alumnoEncontrado));
        }else{
            System.out.println("No se encontro el alumno.");
        }
    }
    
    public static Alumno buscarAlumno(ArrayList<Alumno> alumnos, String nombreAlumno){
        Alumno alumnoBuscado = null;
        for (Alumno alumno : alumnos) {
            //System.out.println(alumno.toString());
            if (alumno.getNombre().equals(nombreAlumno)){
                alumnoBuscado = alumno;
            }
        }
        return alumnoBuscado;
    }
    
}
