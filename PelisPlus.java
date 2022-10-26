/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelisplus;

import java.util.Scanner;
import negocio.CatalogoPeliculas;
import negocio.CatalogoPeliculasImpl;

/**
 *
 * @author dell
 */
public class PelisPlus {
    private static final Scanner scanner= new Scanner(System.in);
    private static int opcion=-1;
    private static final String nombreArchivo= "C:\\Users\\Usuario\\OneDrive\\Escritorio\\Trabajos de U\\cuarto ciclo\\Programación 2\\pruebas\\Peliculas.txt";
    private static final CatalogoPeliculas catalogopeli = new CatalogoPeliculasImpl();
    
    public static void main(String[] args) {
       
        while (opcion != 5) {
            try {
                System.out.println("\tElige la opcion:\n\n\t1.- Iniciar catalogo peliculas"
                    + "\n\t2.- Agregar pelicula\n"
                    + "\t3.- Listar Peliculas\n"
                    + "\t4.- Buscar Pelicula\n"
                    + "\t5.- Salir");

                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        //1. Creamos el objeto que administra el catalogo de personas
                        //La creacion del archivo es opcional, de todas maneras se creara 
                        //al escribir por primera vez en el archivo
                        catalogopeli.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        //2. agregar informacion archivo
                        System.out.println("Introducir nombre de pelicula que quiere agregar,"+ "\nla fecha y el nivel de gusto, separados por un <;> :");
                        String nombre = scanner.nextLine();
                        catalogopeli.agregarPeliculas(nombre, nombreArchivo);                       
                     
                        break;
                    case 3:
                        //3. listar catalogo completo
                        catalogopeli.listarPeliculas(nombreArchivo);
                        
                        break;
                    case 4:
                           
                        //4. Buscar pelicula
                        System.out.println("Introduce el nombre la pelicula que desea buscar:");
                        String buscar = scanner.nextLine();
                        catalogopeli.buscarPeliculas(nombreArchivo, buscar);
                        break;
                    case 5:
                        System.out.println("!Adios!");
                        break;
                    default:
                        System.out.println("La opcion no existe");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }

    }
}
        
        
 
