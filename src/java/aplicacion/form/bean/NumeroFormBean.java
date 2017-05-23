/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.modelo.dominio.Numero;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class NumeroFormBean implements Serializable {
    private double numeroing;
    private int cantnum;
    private String devolver="hola ";
    
    private ArrayList<Numero> num;
    

    /**
     * Creates a new instance of NumeroFormBean
     */
    public NumeroFormBean() {
        num=new ArrayList <>();
    }
    public NumeroFormBean(double numeroing){
        num=new ArrayList <>();
        this.numeroing=numeroing;
    }
    public void agregarNumero(){
        Numero a= new Numero(numeroing);
        num.add(a);
        
        cantnum++;
        System.out.println("hola");
    }
    public void calcular(){
        
        setDevolver("el menor numero es:");
        System.out.println("hola");
        double menor =num.get(1).getNumero();
        double promedio=0;
        String ingresados="Los numeros ingresados son";
        for(Numero a : num)
        {
            if(a.getNumero() < menor) menor = a.getNumero();
            promedio += a.getNumero();
            ingresados += "("+a.getNumero()+"), ";
        }
        devolver += menor + " | El promedio total es de " + ((promedio/cantnum)) + ingresados;
    }
   
    /**
     * @return the num
     */
    public ArrayList<Numero> getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(double num) {
        this.setNum(num);
    }

  

    

  

   

    /**
     * @return the numeroing
     */
    public double getNumeroing() {
        return numeroing;
    }

    /**
     * @param numeroing the numeroing to set
     */
    public void setNumeroing(double numeroing) {
        this.numeroing = numeroing;
    }

    /**
     * @return the cantnum
     */
    public int getCantnum() {
        return cantnum;
    }

    /**
     * @param cantnum the cantnum to set
     */
    public void setCantnum(int cantnum) {
        this.cantnum = cantnum;
    }

    /**
     * @return the devolver
     */
    public String getDevolver() {
        return devolver;
    }

    /**
     * @param devolver the devolver to set
     */
    public void setDevolver(String devolver) {
        this.devolver = devolver;
    }

    /**
     * @param num the num to set
     */
    public void setNum(ArrayList<Numero> num) {
        this.num = num;
    }
    
}
