/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Alumno
 */
public class Circulo implements Serializable {
    
    private double radio;
    private double longitud;
    private double sup;

    public Circulo() {
        
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.longitud = calcularLongitud(radio);
        this.sup = calcularSuperficie(radio);
    }

   

    public double calcularSuperficie(double rad){
        sup=Math.PI*Math.pow(rad, 2);
        return sup;
    }
    public double calcularLongitud(double rad){
        longitud=2*Math.PI*rad;
        return longitud;
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

    /**
     * @return the longitud
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * @return the sup
     */
    public double getSup() {
        return sup;
    }

    /**
     * @param sup the sup to set
     */
    public void setSup(double sup) {
        this.sup = sup;
    }
}
