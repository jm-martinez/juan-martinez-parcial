/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.parcial;

/**
 *
 * @author T-107
 */
public class evaluacion {
    
    String nombre;
    float calificacion;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public evaluacion(String nombre, float calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public evaluacion() {
    }
    
    
}
