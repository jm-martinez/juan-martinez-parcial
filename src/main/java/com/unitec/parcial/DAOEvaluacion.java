/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.parcial;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T-107
 */
public class DAOEvaluacion {

    //Ponemos static para que se cargen inmediatamente antes de iniciar sesion.
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    
    public void abrirSesion(){
        factory= MiConfiguracionHibernate.getSessionFactory();
        session= factory.openSession();
        tranza= session.beginTransaction();
    
    }
    
    public static void cerrarTodo(){
        tranza.commit();
        session.close();
        
    }
    
    public DAOEvaluacion(){
    
    }
    
    public void guardar(evaluacion eva)throws Exception{

        abrirSesion();
        session.save(eva);
        cerrarTodo();
    }
    
    public void actualizar(evaluacion eva)throws Exception{
        session.update(eva);
        cerrarTodo();
        
    }
    
    public List<evaluacion> buscarTodos()throws Exception{
        abrirSesion();
        List<evaluacion> evaluaciones = session.createCriteria(evaluacion.class).list();
        return evaluaciones;
    }
    
    public evaluacion buscarPorId(Integer id)throws Exception{
    
        return null;
    }
    

    public boolean autenticar(evaluacion eva)throws Exception{
    
        return false;
    }
}
