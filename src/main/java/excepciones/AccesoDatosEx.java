/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author dell
 */
public class AccesoDatosEx extends Exception {
    String mensaje;
    
    public AccesoDatosEx(String mensaje){
        this.mensaje=mensaje;
    }
    
}
