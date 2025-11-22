/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author betit
 */
public class Usuarios {
    
    private int claveUsuario;
    private String nombre;
    private String licenciatura;
    private int semestre;

    //datos del usuario
    public Usuarios(int claveUsuario, String nombre, String licenciatura, int semestre) {
        this.claveUsuario = claveUsuario;
        this.nombre = nombre;
        this.licenciatura = licenciatura;
        this.semestre = semestre;
    }

    //getters para mostrar en la ui u/o clase alterna
    public int getClaveUsuario() {
        return claveUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicenciatura() {
        return licenciatura;
    }

    public int getSemestre() {
        return semestre;
    }
    
    
    
}
