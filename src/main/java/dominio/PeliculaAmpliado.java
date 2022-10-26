/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author dell
 */
public class PeliculaAmpliado extends Pelicula {
     private String Fechaproduccion;
     private String NivelGusto;

    public PeliculaAmpliado(String nombre_peli, String Fechaproduccion, String NivelGusto) {
        super(nombre_peli);
        this.Fechaproduccion = Fechaproduccion;
        this.NivelGusto = NivelGusto;
    }

    /**
     * @return the Fproduccion
     */
    public String getFproduccion() {
        return Fechaproduccion;
    }

    /**
     * @param Fproduccion the Fproduccion to set
     */
    public void setFproduccion(String Fechaproduccion) {
        this.Fechaproduccion = Fechaproduccion;
    }

    /**
     * @return the NivelGusto
     */
    public String getNivelGusto() {
        return NivelGusto;
    }

    /**
     * @param NivelGusto the NivelGusto to set
     */
    public void setNivelGusto(String NivelGusto) {
        this.NivelGusto = NivelGusto;
    }
    
}
