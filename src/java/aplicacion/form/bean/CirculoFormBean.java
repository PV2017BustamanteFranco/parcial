/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.modelo.datos.ColeccionCirculos;
import aplicacion.modelo.dominio.Circulo;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class CirculoFormBean implements Serializable{

    private ColeccionCirculos circulos;
    private Circulo circulo;
    private double radio;
   
    /**
     * Creates a new instance of CirculoFormBean
     */
    public CirculoFormBean() {
    
        circulos= new ColeccionCirculos();
    }
    public void agregarCirculo (){
        circulo=(new Circulo(getRadio()));
        circulos.agregarCirculos(circulo);
    }

    /**
     * @return the circulos
     */
    public ColeccionCirculos getCirculos() {
        return circulos;
    }

    /**
     * @param circulos the circulos to set
     */
    public void setCirculos(ColeccionCirculos circulos) {
        this.circulos = circulos;
    }

    /**
     * @return the circulo
     */
    public Circulo getCirculo() {
        return circulo;
    }

    /**
     * @param circulo the circulo to set
     */
    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
