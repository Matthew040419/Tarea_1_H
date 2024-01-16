/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;

/**
 *
 * @author deyvid
 */
public class Estudiante extends Persona {
    private int nivel;
    private String carrera;
    
 public Estudiante(String nombre,int edad,int nivel,String carrera,String email){
     super(nombre,edad,email);
     this.nivel=nivel;
     this.carrera=carrera;
 }
   @Override
    public String toString() {
        String edadStr = (getEdad() == 0) ? "-" : String.valueOf(getEdad());
        String emailStr = (getEmail() == null) ? "email no proporcionado" : getEmail();

        return String.format("Estudiante (Nombre: %s, Email: %s, Edad: %s, Nivel: %d, Carrera: \"%s\")",
                             getNombre(), emailStr, edadStr, nivel, carrera);
    }
}