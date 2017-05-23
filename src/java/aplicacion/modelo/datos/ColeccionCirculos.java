/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.Circulo;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ColeccionCirculos implements Serializable {
    private ArrayList<Circulo> circulos;

    public ColeccionCirculos() {
        circulos=new ArrayList();
    }

    public void agregarCirculos(Circulo unCirculo){
        getCirculos().add(unCirculo);
    }
    
    /**
     * @return the circulos
     */
    public ArrayList<Circulo> getCirculos() {
        return circulos;
    }

    /**
     * @param circulos the circulos to set
     */
    public void setCirculos(ArrayList<Circulo> circulos) {
        this.circulos = circulos;
    }
    
}
