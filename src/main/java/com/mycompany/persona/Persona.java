/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

/**
 *
 * @author deyvid
 */
public class Persona {

    private String nombre;
    private int edad;
    private String email;

    public Persona(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }
    
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Mateo", 21, 1, "Ingeniería Software", null);
        Estudiante estudiante2 = new Estudiante("Deyvid", 21, 5, "Ingeniería Mecánica", "deyvid0401@gmail.com");
        Estudiante estudiante3 = new Estudiante("Sebastian", 19, 3, "Ingeniería Electronica", "sebastiandedel96@gmail.com");
        Estudiante estudiante4 = new Estudiante("Isacc", 22, 8, "Ingeniería Petroquimica", "Isaccthew@gmail.com");

        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiante3.toString());
        System.out.println(estudiante4.toString());
    }
}