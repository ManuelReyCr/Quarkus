package org.prueba;

import java.util.List;

import io.smallrye.common.constraint.NotNull;


public class Persona{
    @NotNull
    public int id;
    @NotNull
    public int edad;
    @NotNull
    public String Nombre;

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
}


