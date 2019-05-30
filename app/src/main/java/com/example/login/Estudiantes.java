package com.example.login;

public class Estudiantes {
    private String nombre;
    private int foto;

    public Estudiantes(String nombre, int foto){

        this.nombre = nombre;
        this.foto = foto;
    }

    public String getNombre(){
        return this.nombre;

    }
}
